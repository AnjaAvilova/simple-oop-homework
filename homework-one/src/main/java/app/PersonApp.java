package app;

import dto.Employee;

public class PersonApp {
    public static void printInfo(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }
    }
}
