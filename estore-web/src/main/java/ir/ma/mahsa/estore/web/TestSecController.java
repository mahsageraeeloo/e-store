package ir.ma.mahsa.estore.web;

import ir.ma.mahsa.estore.EstoreWebApplication;
import ir.ma.mahsa.estore.core.item.IItemBusiness;
import ir.ma.mahsa.estore.core.item.IItemDao;
import ir.ma.mahsa.estore.core.item.ItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Amir
 */
@Controller
public class TestSecController {

    final IItemBusiness iItemBusiness;

    public TestSecController(final IItemBusiness iItemBusiness) {
        this.iItemBusiness = iItemBusiness;
    }

    @GetMapping(value = "/hi")
    public String getCurrentUser(Model model) {
//        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        model.addAttribute("name", principal.getUsername());
        return "greeting";
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<ItemEntity> itemEntityList = iItemBusiness.getItems();
        model.addAttribute("itemList", itemEntityList);
        return "products";
    }
}
