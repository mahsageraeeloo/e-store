package ir.ma.mahsa.estore.web.item;

import ir.ma.mahsa.estore.core.item.IItemBusiness;
import ir.ma.mahsa.estore.core.item.ItemEntity;
import ir.ma.mahsa.estore.model.nopersist.ShoppingCart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class ItemController {
    final IItemBusiness iItemBusiness;


    public ItemController(final IItemBusiness iItemBusiness, ShoppingCart shoppingCart) {
        this.iItemBusiness = iItemBusiness;
    }


    @GetMapping("/products")
    public String getProducts(Model model) {
//        System.out.println("cartCounter = " + shoppingCart.getCounter());
        List<ItemEntity> itemEntityList = iItemBusiness.getItems();
        model.addAttribute("itemList", itemEntityList);
//        model.addAttribute("cartId", shoppingCart.getCounter());
        return "products";
    }
}
