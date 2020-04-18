package com.nivas.jdbc;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonService {

    @Autowired
    JdbcTemPlateDAO jdbcTemPlateDAO;

    public void updatePerson(Person person){
        jdbcTemPlateDAO.updatePerson(person);
    }

    public List<Person> getAllPersons() {
        return jdbcTemPlateDAO.getAllPersons();
    }

    public List<Person> getAllPersonFromRowCallBackMethod() {
        return jdbcTemPlateDAO.getAllPersonFromRowCallBackMethod();
    }
}
