package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public abstract class Employee extends Person {


    private String company;
    private String position;
    private double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();
}