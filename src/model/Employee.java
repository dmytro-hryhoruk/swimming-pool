package model;

public final class Employee {
    private final String name;
    private final String surname;
    private final double salary;
    private String position;

    public Employee(String name,
                    String surname,
                    double salary,
                    String post) {
        this.salary = salary;
        this.name = name;
        this.surname = surname;
        this.position = post;
    }

    public String getPersonalData() {
        return name + " " + surname;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person='" + name +
                ", surname='" + surname +
                ", post=" + position +
                '}';
    }
}

