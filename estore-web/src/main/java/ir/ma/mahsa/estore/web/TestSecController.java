package ir.ma.mahsa.estore.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Amir
 */
@Controller
public class TestSecController {

//    final IItemBusiness iItemBusiness;
//
//    public TestSecController(final IItemBusiness iItemBusiness) {
//        this.iItemBusiness = iItemBusiness;
//    }

    @GetMapping(value = "/home")
    public String getCurrentUser(Model model) {
//        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        model.addAttribute("name", principal.getUsername());
        return "home";
    }

    @GetMapping(value = "/sakineh")
    public String generateHeader(Model model) {
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("name", principal.getUsername());
        return "header-notUsed";
    }


}
