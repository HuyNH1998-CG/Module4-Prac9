package Controller;

import Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @GetMapping("/showform")
    public ModelAndView showForm(@ModelAttribute("employee") Employee employee) {
        return new ModelAndView("/create");
    }

    @PostMapping("/addEmployee")
    public ModelAndView submit(@ModelAttribute("employee") Employee employee) {
        return new ModelAndView("/info");
    }
}
