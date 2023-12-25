package org.narainox.employee.services;

import org.narainox.employee.model.Employee;
import org.narainox.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        Employee save = employeeRepository.save(employee);
        return save;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees =employeeRepository.findAll();
        return employees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee employee1=employeeRepository.findById(id).get();
        employee1.setEmailId(employee.getEmailId());
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        return employeeRepository.save(employee1);
    }

    @Override
    public boolean deleteEmployee(Long id) {
        Employee employee1=employeeRepository.findById(id).get();
        employeeRepository.delete(employee1);
        return true;
    }


}
