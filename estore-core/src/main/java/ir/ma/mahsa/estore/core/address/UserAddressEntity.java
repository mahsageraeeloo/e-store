package ir.ma.mahsa.estore.core.address;

import ir.ma.mahsa.estore.core.user.UserEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Amir
 */
@Entity
@Table(name = "es_user_address")
@Data
public class UserAddressEntity {
    @Id
    @GeneratedValue
    private Long addressId;
    private String address;
//    @ManyToOne
//    private UserEntity user;
}
