package com.nivas.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemPlateDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updatePerson(Person person){
        String sql = "insert into Person (first_Name, Last_Name, Address) values (?, ?, ?)";
        jdbcTemplate.update(sql,person.getFirstName(),person.getLastName(),person.getAddress());
    }

    public List<Person> getAllPersons(){
        //Implementing RowMapper in jdbcTemplate query method in java 8 style
        List<Person> allPersons = jdbcTemplate.query("select * from Person",(resultSet, i) -> {
            return toPerson(resultSet);
        });
        return allPersons;
    }

    private static Person toPerson(ResultSet resultSet) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getLong("ID"));
        person.setFirstName(resultSet.getString("FIRST_NAME"));
        person.setLastName(resultSet.getString("LAST_NAME"));
        person.setAddress(resultSet.getString("ADDRESS"));
        return person;
    }

    public List<Person> getAllPersonFromRowCallBackMethod(){
        List<Person> personList = new ArrayList<>();
        jdbcTemplate.query("select * from Person",(resultSet)->{
            Person person = new Person();
            person.setId(resultSet.getLong("ID"));
            person.setFirstName(resultSet.getString("FIRST_NAME"));
            person.setLastName(resultSet.getString("LAST_NAME"));
            person.setAddress(resultSet.getString("ADDRESS"));
            personList.add(person);
        });
        return personList;
    }


}
