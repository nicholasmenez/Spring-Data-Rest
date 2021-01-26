package com.reactspring.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }
    @Override
    public void run(String...strings) throws Exception{
        this.repository.save(new Employee("Nicholas", "Menezes","Java Dev"));
        this.repository.save(new Employee("Nenad", "Andrejić","Manager"));
        this.repository.save(new Employee("Luke", "Skywalker","Jedi"));
        this.repository.save(new Employee("Bruce", "Wayne","Bat"));

    }
}
