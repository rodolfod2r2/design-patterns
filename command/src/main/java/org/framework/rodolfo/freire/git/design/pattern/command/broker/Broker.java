package org.framework.rodolfo.freire.git.design.pattern.command.broker;

import org.framework.rodolfo.freire.git.design.pattern.command.stock.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
