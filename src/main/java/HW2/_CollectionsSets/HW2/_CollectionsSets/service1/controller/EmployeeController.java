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
    public Employee find(@RequestParam(name = "firstName") String firstName,
                         @RequestParam(name = "lastName") String lastName) {
        return employeeService.searchEmployee(firstName, lastName);
    }

    @GetMapping("/add")
    public void add(@RequestParam(name = "firstName") String firstName,
                    @RequestParam(name = "lastName") String lastName) {
        employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public void remove(@RequestParam(name = "firstName") String firstName,
                       @RequestParam(name = "lastName") String lastName) {
        employeeService.removeEmployee(firstName, lastName);
    }
}
