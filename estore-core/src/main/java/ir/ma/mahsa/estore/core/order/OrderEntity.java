package ir.ma.mahsa.estore.core.order;

import ir.ma.mahsa.estore.core.address.UserAddressEntity;
import ir.ma.mahsa.estore.core.item.ItemEntity;
import ir.ma.mahsa.estore.core.user.UserEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

/**
 * @author Amir
 */
@Entity
@Table(name = "es_order")
@Data
public class OrderEntity {
    @Id
    @GeneratedValue
    private Long orderId;
    private Date orderDate;
    @ManyToOne
    private UserEntity user;
    @ManyToMany
    @JoinTable(name = "es_order_item")
    private Set<ItemEntity> orderedItems;
    @ManyToOne
    @JoinColumn(name = "", foreignKey = @ForeignKey(name = ""))
    private UserAddressEntity shippingAddress;
    @JoinTable(name = "es_order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
