package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClassesController {

    @GetMapping("/classes")
    public String classes(@RequestParam(name="name", required=false) String[] students, Model model) {
        students = new String[]{"John", "Henry", "Robin", "Nathan"};
        model.addAttribute("students", students);
        return "classes";
    }

}