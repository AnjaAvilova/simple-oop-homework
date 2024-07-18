import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Manager extends Employee {
    private int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    @Override
    public String getCompany() {
        return super.getCompany();
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public void setCompany(String company) {
        super.setCompany(company);
    }

    @Override
    public void setPosition(String position) {
        super.setPosition(position);
    }

    @Override
    public void setBaseSalary(double baseSalary) {
        super.setBaseSalary(baseSalary);
    }

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married, company, position, baseSalary);
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

    public Manager(String name, int age, boolean married) {
        super(name, age, married);
    }
}
