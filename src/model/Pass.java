package model;

import java.time.LocalDate;

public final class Pass {
    private Long id;
    private final LocalDate expireDate;
    private final String type;
    private int price;

    public Pass(String type, LocalDate expireDate) {
        this.expireDate = expireDate;
        this.type = type;
    }

    public void setPriceByType(String type) {
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
