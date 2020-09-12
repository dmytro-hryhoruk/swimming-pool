package service;

import java.util.ArrayList;
import java.util.List;
import model.SwimmingStuff;

public final class StuffRent {
    private final String rentPeriod;
    private final List<SwimmingStuff> goods;

    public StuffRent(String rentPeriod) {
        this.rentPeriod = rentPeriod;
        goods = new ArrayList<>();
    }

    public void addStuffRent(SwimmingStuff swimmingStuff) {
        goods.add(swimmingStuff);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Stuff for rent: ");
        for (SwimmingStuff c : goods) {
            stringBuilder.append("\n\tType: ")
                    .append(c.getType())
                    .append("\t Price: ")
                    .append(c.getPrice());
        }
        return stringBuilder.toString();
    }

}
