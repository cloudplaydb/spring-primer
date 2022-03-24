package com.spring.mvc.controller;

import com.spring.mvc.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class EmployeeController {

    Map<Long, Employee> employeeMap = new HashMap<>();

    @ModelAttribute("employees")
    public void initEmployees() {
        employeeMap.put(1L, new Employee(1L , "John", "22333411", "rh"));
        employeeMap.put(2L, new Employee(2L , "Peter", "22333411", "rh"));
        employeeMap.put(3L, new Employee(3L , "Mike", "22333411", "rh"));
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("employeeHome", "employee", new Employee());
    }

    public @ResponseBody Employee getEmployeeById(@PathVariable final Long id) {
        return employeeMap.get(id);
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") final Employee employee, final BindingResult result,
                         final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("workingArea", employee.getWorkingArea());
        model.addAttribute("id", employee.getId());
        employeeMap.put(employee.getId(), employee);
        return "EmployeeView";
    }

    public void addAttributes(final Model model) {
        model.addAttribute("msg", "Welcome to the Netherlands");
    }

}
