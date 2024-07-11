package org.framework.rodolfo.freire.git.design.pattern.filter.criteria;

import org.framework.rodolfo.freire.git.design.pattern.filter.model.Person;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
