package ir.ma.mahsa.estore.core.item;

import java.util.List;

/**
 * @author Amir
 */
public interface IItemBusiness {
    List<ItemEntity> getItems();
    void persistItem(ItemEntity itemEntity);
}
