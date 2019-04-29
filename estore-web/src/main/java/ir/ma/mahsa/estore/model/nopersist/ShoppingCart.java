package ir.ma.mahsa.estore.model.nopersist;

import ir.ma.mahsa.estore.core.order.OrderEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpSession;

@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, value = WebApplicationContext.SCOPE_SESSION)
public class ShoppingCart {
    private OrderEntity currentOrder;
    private int counter = 2;

    public ShoppingCart() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public OrderEntity getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(OrderEntity currentOrder) {
        this.currentOrder = currentOrder;
    }
}
