package ir.ma.mahsa.estore.web.item;

import ir.ma.mahsa.estore.core.item.IItemBusiness;
import ir.ma.mahsa.estore.core.item.ItemEntity;
import ir.ma.mahsa.estore.web.IHeaderController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class ItemController implements IHeaderController {
    final IItemBusiness iItemBusiness;

    public ItemController(final IItemBusiness iItemBusiness) {
        this.iItemBusiness = iItemBusiness;
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<ItemEntity> itemEntityList = iItemBusiness.getItems();
        model.addAttribute("itemList", itemEntityList);
        return "products";
    }
}
