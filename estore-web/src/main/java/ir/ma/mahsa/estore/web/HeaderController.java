package ir.ma.mahsa.estore.web;

import ir.ma.mahsa.estore.model.nopersist.ShoppingCart;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class HeaderController {

    private final ShoppingCart shoppingCart;

    public HeaderController(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @ModelAttribute
    public void generateHeader(Model model){
        /* Adding username to the header*/
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("username", principal.getUsername());

        /* Adding shopping cart information*/
        model.addAttribute("orderedItemsNo", shoppingCart.getCurrentOrder().getOrderedItems().size());
        model.addAttribute("orderPrice", shoppingCart.getCurrentOrder().getOrderPrice());
        model.addAttribute("cartId", shoppingCart.getCounter());
    }
}
