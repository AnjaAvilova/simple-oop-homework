package app;

import dto.Employee;
import dto.SaleManager;

import java.util.Arrays;

public class PersonApp {
    public static void printInfo(Employee[] employees) {
        if (employees == null) {
            return;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].display();
            }
        }
    }

    public static double calculateSale(Employee[] employees) {
        if (employees == null) {
            return 0;
        }
        double sale = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sale = sale + employees[i].calculateSalary();
            }

        }
        return sale;
    }

    public static double gainSales(Employee[] employees) {
        if (employees == null) {
            return 0;
        }
        double totalSales = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i] instanceof SaleManager) {
                    SaleManager saleManager = (SaleManager) employees[i];
                    totalSales = totalSales + saleManager.getTotalSales();
                }
            }
        }
        return totalSales;
    }


    public static boolean person(Employee[] employees, Employee employee) {
        if (employees == null || employee == null) {
            return false;
        }
//        Arrays.asList(employees).contains(employee)
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].equals(employee)) {
                    return true;
                }

            }


        }return false;

    }


}
