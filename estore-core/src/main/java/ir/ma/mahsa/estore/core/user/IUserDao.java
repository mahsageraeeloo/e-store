package ir.ma.mahsa.estore.core.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amir
 */
@Repository
public interface IUserDao extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
