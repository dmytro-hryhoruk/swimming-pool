package service;

import java.time.LocalDate;
import model.Client;
import model.Pass;
import storage.Storage;

public final class PurchaseService {
    private Storage storage;

    public PurchaseService(Storage storage) {
        this.storage = storage;
    }

    public void purchasePassToClient(Client client, String passType) {
        Pass pass = new Pass(passType, LocalDate.now());
        pass.setPriceByType(passType);
        pass = storage.createPass(pass);

        client.setPassId(pass.getId());
        storage.updateClient(client);
    }
}


