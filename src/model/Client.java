package model;

public final class Client {
    private Long id;
    private final String name;
    private final String surname;
    private final double temperature;
    private Integer balance;
    private Long passId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client(String name,
                  String surname,
                  Integer balance,
                  double temperature) {
        this.name = name;
        this.surname = surname;
        this.temperature = temperature;
    }

    public void setPassId(Long passId) {
        this.passId = passId;
    }

    public String getPersonalData() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


