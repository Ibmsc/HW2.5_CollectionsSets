package HW2._CollectionsSets.HW2._CollectionsSets.controller;

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
    public Employee add(@RequestParam(name = "firstName") String firstName,
                        @RequestParam(name = "lastName") String lastName) {
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam(name = "firstName") String firstName,
                           @RequestParam(name = "lastName") String lastName) {
        return employeeService.removeEmployee(firstName, lastName);
    }
}
