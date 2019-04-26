package ir.ma.mahsa.estore.core.order;

import ir.ma.mahsa.estore.core.item.ItemEntity;

/**
 * @author Amir
 */
public interface IOrderBusiness {
    void addItemToOrder(ItemEntity itemEntity);
}
