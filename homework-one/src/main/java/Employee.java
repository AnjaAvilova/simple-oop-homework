import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class Employee extends Person{


    private String company;
    private String position;
    private double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public boolean isMarried() {
        return super.isMarried();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setMarried(boolean married) {
        super.setMarried(married);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Employee(String name, int age, boolean married) {
        super(name, age, married);
    }
}
