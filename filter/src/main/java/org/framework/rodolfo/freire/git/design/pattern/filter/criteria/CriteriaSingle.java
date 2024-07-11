package org.framework.rodolfo.freire.git.design.pattern.filter.criteria;

import org.framework.rodolfo.freire.git.design.pattern.filter.model.Person;
import org.framework.rodolfo.freire.git.design.pattern.filter.util.enums.EnumMarital;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase(EnumMarital.SINGLE.getDescription())) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }

}
