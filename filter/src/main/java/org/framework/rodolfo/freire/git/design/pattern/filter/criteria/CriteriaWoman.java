package org.framework.rodolfo.freire.git.design.pattern.filter.criteria;

import org.framework.rodolfo.freire.git.design.pattern.filter.model.Person;
import org.framework.rodolfo.freire.git.design.pattern.filter.util.enums.EnumGender;

import java.util.ArrayList;
import java.util.List;

public class CriteriaWoman implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> womanPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase(EnumGender.WOMAN.getDescription())) {
                womanPersons.add(person);
            }
        }
        return womanPersons;
    }

}
