package HW2._CollectionsSets.HW2._CollectionsSets.service1;

import HW2._CollectionsSets.HW2._CollectionsSets.service1.exception.EmployeeAlreadyAddedException;
import HW2._CollectionsSets.HW2._CollectionsSets.service1.exception.EmployeeNotFoundException;
import HW2._CollectionsSets.HW2._CollectionsSets.service1.exception.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(String firstName, String lastName) {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже есть в базе");
        } else {
            employees.add(emp);
        }
    }

    public void removeEmployee(String firstName, String lastName) {
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
