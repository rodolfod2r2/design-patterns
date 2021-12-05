package org.framework.rodolfo.freire.git.design.patterns.filter.criteria;

import org.framework.rodolfo.freire.git.design.patterns.filter.model.Person;
import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumMarital;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMarried implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> maritalPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase(EnumMarital.MARRIED.getDescription())) {
                maritalPersons.add(person);
            }
        }
        return maritalPersons;
    }

}
