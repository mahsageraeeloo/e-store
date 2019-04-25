package ir.ma.mahsa.estore.model.nopersist;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpSession;

@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, value = WebApplicationContext.SCOPE_SESSION)
public class ShoppingCart {

    private static int counter;


    public ShoppingCart(HttpSession httpSession) {
        System.out.println("Http session id: " + httpSession.getId());
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
