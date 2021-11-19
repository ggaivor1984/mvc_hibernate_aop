package ru.gaivor.springcourse.mvc_hibernate_aop.dao;

import ru.gaivor.springcourse.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

  public  Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
