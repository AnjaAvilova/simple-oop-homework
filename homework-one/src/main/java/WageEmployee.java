import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WageEmployee extends Employee{
    private double hours;
    private double wage;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary, double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

}
