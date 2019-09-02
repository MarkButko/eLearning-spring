package butko.marko.controller.view;

import butko.marko.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/view/users")
public class UserController {
    
    private static List<User> users;

    static {
        users = new ArrayList<>(5);
        User first = new User();
        first.setId(0L);
        first.setName("First");
        users.add(first);
    }
    
    @ModelAttribute
    public void populateModel(Model model) {
        model.addAttribute("users", users);
    }
    
    @RequestMapping("/")
    public String index() {
        return "redirect:/index";
    }
    
    @RequestMapping(path = "/index", method = GET)
    public String index(@ModelAttribute("model") Model model) {
        model.addAttribute("title", "index");
        return "index";
    } 
}
