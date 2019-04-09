package ir.ma.mahsa.estore.core.user;

import ir.ma.mahsa.estore.core.address.UserAddressEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * @author Amir
 */
@Entity
@Table(name = "es_user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue
    private Long userId;
    private String username;
    private String password;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Set<UserAddressEntity> addresses;
}
