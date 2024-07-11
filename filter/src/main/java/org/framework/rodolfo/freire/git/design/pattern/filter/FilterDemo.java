package org.framework.rodolfo.freire.git.design.pattern.filter;

import org.framework.rodolfo.freire.git.design.pattern.filter.criteria.*;
import org.framework.rodolfo.freire.git.design.pattern.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("TONY STARK", "MEN", "SINGLE"));
        persons.add(new Person("STEVE ROGERS", "MEN", "MARRIED"));
        persons.add(new Person("PEPPER POTTS", "WOMAN", "MARRIED"));
        persons.add(new Person("NATASHA ROMANOFF", "WOMAN", "SINGLE"));
        persons.add(new Person("CLINT BARTON", "MEN", "SINGLE"));
        persons.add(new Person("THOR", "MEN", "SINGLE"));

        Criteria men = new CriteriaMen();
        Criteria woman = new CriteriaWoman();
        Criteria single = new CriteriaSingle();
        Criteria married = new CriteriaMarried();

        Criteria singleAndMen = new AndCriteria(single, men);
        Criteria singleAndWoman = new AndCriteria(single, woman);

        Criteria marriedAndMen = new AndCriteria(married, men);
        Criteria marriedAndWoman = new AndCriteria(married, woman);

        Criteria singleOrMale = new OrCriteria(single, men);
        Criteria marriedOrWoman = new OrCriteria(married, woman);

        System.out.println("CRITERIA [ GENDER MEN ]");
        printPersons(men.meetCriteria(persons));

        System.out.println("\nCRITERIA [ GENDER WOMAN ]");
        printPersons(woman.meetCriteria(persons));

        System.out.println("\nCRITERIA [ SINGLE AND MEN ]");
        printPersons(singleAndMen.meetCriteria(persons));

        System.out.println("\nCRITERIA [ SINGLE AND WOMAN ]");
        printPersons(singleAndWoman.meetCriteria(persons));

        System.out.println("\nCRITERIA [ MARRIED AND MEN ]");
        printPersons(marriedAndMen.meetCriteria(persons));

        System.out.println("\nCRITERIA [ MARRIED AND WOMAN ]");
        printPersons(marriedAndWoman.meetCriteria(persons));

        System.out.println("\nCRITERIA [ SINGLE OR MEN ]");
        printPersons(singleOrMale.meetCriteria(persons));

        System.out.println("\nCRITERIA [ MARRIED OR WOMAN ]");
        printPersons(marriedOrWoman.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(
                    "Person : [ Name : " + person.getName()
                            + ", Gender : " + person.getGender()
                            + ", Marital Status : " + person.getMaritalStatus()
                            + " ]"
            );
        }
    }

}
