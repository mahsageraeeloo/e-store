package ir.ma.mahsa.estore;

import ir.ma.mahsa.estore.core.user.IUserDao;
import ir.ma.mahsa.estore.core.user.UserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.support.TransactionTemplate;

@SpringBootApplication
public class EstoreWebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(EstoreWebApplication.class, args);
        IUserDao userDao = applicationContext.getBean(IUserDao.class);

        UserEntity s = new UserEntity();
        s.setUsername("mahsajoon");
        s.setPassword("amirjoonam");
        userDao.save(s);
//        TransactionTemplate transactionTemplate = applicationContext.getBean(TransactionTemplate.class);
//        transactionTemplate.execute(transactionStatus -> {
//
//        });
        UserEntity mahsajoon = userDao.findByUsername("mahsajoon");
        System.out.println("mahsajoon = " + mahsajoon);
    }

}
