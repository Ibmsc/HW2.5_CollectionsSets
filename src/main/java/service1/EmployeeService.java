package service1;

import HW2._CollectionsSets.exception.EmployeeAlreadyAddedException;
import HW2._CollectionsSets.exception.EmployeeNotFoundException;
import HW2._CollectionsSets.exception.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(String firstName, String lastName) {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            employees.add(emp);
        } else {
            throw new EmployeeAlreadyAddedException("Сотрудник уже есть в базе");
        }
    }

    public void deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            employees.remove(employee);
        } else {
            throw new EmployeeNotFoundException("Сотрудник не найден в базе");
        }
    }

    public Employee searchEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден в базе");
    }

  /*  Employee[] employees = new Employee[10];
    public void addEmployee(String firstName, String lastName) {
        if ()
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(firstName, lastName);
                return;
            }
        }
        throw new EmployeeStorageIsFullException("Массив сотрудников переполнен");
    }
    public void deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            if (Objects.equals(employee,employees[i])) {
                employees[i] = null;
                return;
            }
        }
        System.out.println("Сотрудник не найден");
    }
    public Employee searchEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (Employee value : employees) {
            if (Objects.equals(value, employee)) {
                return value;
            }
       }
        throw new EmployeeNotFoundException("Сотрудник не найден");}*/
}
