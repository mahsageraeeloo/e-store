package ir.ma.mahsa.estore.core.item;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amir
 */
@Repository
public interface IItemDao extends CrudRepository<ItemEntity, Long> {
    public Iterable<ItemEntity> findAll();
}
