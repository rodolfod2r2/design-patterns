package org.framework.rodolfo.freire.git.design.pattern.composite;

import org.framework.rodolfo.freire.git.design.pattern.composite.entity.Employee;

public class CompositeDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("Tony Stark", "CEO", 30000);

        Employee headSales = new Employee("Steve Rogers", "Head Sales", 20000);
        Employee headMarketing = new Employee("Bruce Banner", "Head Marketing", 20000);
        Employee clerk1 = new Employee("Natasha", "Marketing", 10000);
        Employee clerk2 = new Employee("Vespa", "Marketing", 10000);
        Employee salesExecutive1 = new Employee("Hulk", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Thor", "Sales", 10000);
        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

}
