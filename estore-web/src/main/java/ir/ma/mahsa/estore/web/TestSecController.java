package ir.ma.mahsa.estore.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Amir
 */
@Controller
public class TestSecController {

    @GetMapping(value = "/hi")
    public String getCurrentUser(Model model) {
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("name", principal.getUsername());
        return "greeting";
    }
}
