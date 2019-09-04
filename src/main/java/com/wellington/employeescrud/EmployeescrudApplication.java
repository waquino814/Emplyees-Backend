package com.wellington.employeescrud;

import com.wellington.employeescrud.model.Employee;
import com.wellington.employeescrud.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeescrudApplication {
    private static final Logger log = LoggerFactory.getLogger(EmployeescrudApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EmployeescrudApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(EmployeeRepository employeeRepository){
        return  args -> {
            log.info("Loading Test Data");
            Employee employee = new Employee("emp1","lastn","ema1");
            employeeRepository.save(employee);
        };
    }
}
