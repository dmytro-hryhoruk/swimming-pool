package service;

import java.time.LocalDate;
import model.Pass;
import storage.Storage;

public class ValidatePassService {
    private Storage storage;

    public ValidatePassService(Storage storage) {
        this.storage = storage;
    }

    public boolean isPassValid(Pass pass) {
        return pass.getExpireDate()
                .isBefore(LocalDate.now().plusDays(1));
    }
}
