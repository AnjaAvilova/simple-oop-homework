import app.PersonApp;
import dto.*;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Kate", 26, true, "company", "manager", 35, 2);
        Manager manager2 = new Manager("Alex", 50, false, "company", "manager", 50, 2);
        Manager manager3 = new Manager("Ян", 30, true, "company", "manager", 45, 2);
        SaleManager saleManager1 = new SaleManager("Maria", 37, false, "company2", "saleManager", 65, 23, 4);
        SaleManager saleManager2 = new SaleManager("Саша", 45, true, "company2", "saleManager", 65, 23, 3);
        SaleManager saleManager3 = new SaleManager("Вася", 56, false, "company2", "saleManager", 105, 23, 6);
        SaleManager saleManager4 = new SaleManager("Ярослав", 62, false, "company2", "saleManager", 65, 23, 3);
        WageEmployee wageEmployee1 = new WageEmployee("Петр", 55, true, "company3", "wageManager", 98, 8, 12);
        WageEmployee wageEmployee2 = new WageEmployee("Аксинья", 25, true, "company3", "wageManager", 68, 35, 12);
        WageEmployee wageEmployee3 = new WageEmployee("Фрося", 20, true, "company3", "wageManager", 78, 40, 12);

        Employee[] employees = {manager1, manager2, manager3, saleManager1, saleManager2, saleManager3, null, wageEmployee1, wageEmployee2, wageEmployee3};
        PersonApp.printInfo(employees);
        PersonApp.printInfo(null);
    }

}
