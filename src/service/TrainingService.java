package service;

import java.util.ArrayList;
import java.util.List;
import model.SwimmingPool;

public final class TrainingService {
    private final List<SwimmingPool> swimmingPools;

    public TrainingService() {
        swimmingPools = new ArrayList<>();
    }

    public void addSwimmingPool(SwimmingPool swimmingPool) {
        swimmingPools.add(swimmingPool);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Swimming Pool info: ");
        for (SwimmingPool c : swimmingPools) {
            stringBuilder.append("\n\tName: ")
                    .append(c.getName())
                    .append("\t Adress: ")
                    .append(c.getAddress())
                    .append("\n\tDepth: ")
                    .append(c.getDepth())
                    .append("\tWidth: ")
                    .append(c.getWidth())
                    .append("\tLength: ")
                    .append(c.getLength());
        }
        return stringBuilder.toString();
    }

}
