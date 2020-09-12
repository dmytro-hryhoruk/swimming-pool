package service;

import java.util.LinkedList;
import java.util.List;
import model.Locker;

public final class LockerService {
    private final List<Locker> lockers;

    public LockerService() {
        this.lockers = new LinkedList<>();
    }

    public void fixLockers(List<Locker> lockers) {
        for (Locker locker : lockers) {
            if (!locker.getServiceability()) {
                locker.setServiceability(true);
            }
        }
    }

    public void addLocker(Locker locker) {
        lockers.add(locker);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\tLockers: ");
        for (Locker c : lockers) {
            stringBuilder.append("\n\tnumber: ")
                    .append(c.getNumber())
                    .append("\t Serviceability: ")
                    .append(c.getServiceability());
        }

        return stringBuilder.toString();
    }
}
