package HW2._CollectionsSets.HW2._CollectionsSets.service1.controller;

import org.springframework.web.bind.annotation.*;
import HW2._CollectionsSets.HW2._CollectionsSets.service1.Employee;
import HW2._CollectionsSets.HW2._CollectionsSets.service1.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find")
    public String find(@RequestParam(name = "firstName") String firstName,
                       @RequestParam(name = "lastName") String lastName) {
        employeeService.searchEmployee(firstName, lastName);
        return String.format("<h1>Сотрудник с именем '%s', фамилией '%s' найден в базе!</h1>", firstName, lastName);
    }

    @GetMapping("/add")
    public String add(@RequestParam(name = "firstName") String firstName,
                      @RequestParam(name = "lastName") String lastName) {
        employeeService.addEmployee(firstName, lastName);
        return String.format("<h1>Сотрудник с именем '%s', фамилией '%s' добавлен в базу!</h1>", firstName, lastName);
    }

    @GetMapping("/remove")
    public String remove(@RequestParam(name = "firstName") String firstName,
                         @RequestParam(name = "lastName") String lastName) {
        employeeService.removeEmployee(firstName, lastName);
        return String.format("<h1>Сотрудник с именем '%s', фамилией '%s' удален из базы!</h1>", firstName, lastName);
    }
}
