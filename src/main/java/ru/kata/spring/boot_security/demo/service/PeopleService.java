package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Person;


import java.util.List;



public interface PeopleService {

    List<Person> findAll();

    Person find(int id);

    void save(Person person);

    void update(int id, Person person);

    void delete(int id);




}
