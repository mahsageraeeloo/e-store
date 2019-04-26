package ir.ma.mahsa.estore.core.order;

import ir.ma.mahsa.estore.core.item.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amir
 */
@Repository
public interface IOrderDao extends CrudRepository<OrderEntity, Long> {

}
