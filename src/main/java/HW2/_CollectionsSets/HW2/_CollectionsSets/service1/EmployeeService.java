package HW2._CollectionsSets.HW2._CollectionsSets.service1;

import HW2._CollectionsSets.HW2._CollectionsSets.exception.EmployeeAlreadyAddedException;
import HW2._CollectionsSets.HW2._CollectionsSets.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @ResponseStatus(code = HttpStatus.BAD_REQUEST, reason =  "EmployeeAlreadyAddedException" )
    public Employee addEmployee(String firstName, String lastName) throws EmployeeAlreadyAddedException {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже есть в базе");
        } else {
            employees.add(emp);
            return emp;
        }
    }

    public Employee removeEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        } else {
            throw new EmployeeNotFoundException("Сотрудник не найден в базе");
        }
    }

    public Employee searchEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден в базе");
    }

}