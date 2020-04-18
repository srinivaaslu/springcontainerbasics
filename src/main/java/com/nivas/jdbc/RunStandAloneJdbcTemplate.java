package com.nivas.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RunStandAloneJdbcTemplate {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
        PersonService personService = configApplicationContext.getBean(PersonService.class);
        Person person = Person.create("Dana", "Whitley", "464 Gorsuch Drive");
        personService.updatePerson(person);
        List<Person> allPersons = personService.getAllPersonFromRowCallBackMethod();
        System.out.println(allPersons);
    }


}
