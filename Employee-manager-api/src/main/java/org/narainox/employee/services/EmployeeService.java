package org.narainox.employee.services;

import org.narainox.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    boolean deleteEmployee(Long id);
}
