package ir.ma.mahsa.estore.core.item.impl;

import ir.ma.mahsa.estore.core.item.IItemBusiness;
import ir.ma.mahsa.estore.core.item.IItemDao;
import ir.ma.mahsa.estore.core.item.ItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Amir
 */
@Service
public class ItemBusinessImpl implements IItemBusiness {
    final IItemDao iItemDao;

    public ItemBusinessImpl(final IItemDao iItemDao) {
        this.iItemDao = iItemDao;
    }

    @PostConstruct
    public void init() {
        ItemEntity item = new ItemEntity();
        item.setName("sofa");
        item.setPrice(1000L);
        persistItem(item);
        ItemEntity item2 = new ItemEntity();
        item2.setName("sofa2");
        item2.setPrice(2000L);
        persistItem(item2);
    }

    @Override
    public List<ItemEntity> getItems() {
        Iterable<ItemEntity> all = iItemDao.findAll();
        List<ItemEntity> itemsList = new ArrayList<>();
        all.forEach(itemsList::add);
        return itemsList;
    }

    @Override
    public void persistItem(final ItemEntity itemEntity) {
        iItemDao.save(itemEntity);
    }
}
