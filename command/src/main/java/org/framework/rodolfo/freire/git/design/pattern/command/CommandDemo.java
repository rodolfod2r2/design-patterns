package org.framework.rodolfo.freire.git.design.pattern.command;

import org.framework.rodolfo.freire.git.design.pattern.command.broker.Broker;
import org.framework.rodolfo.freire.git.design.pattern.command.stock.BuyStock;
import org.framework.rodolfo.freire.git.design.pattern.command.stock.SellStock;
import org.framework.rodolfo.freire.git.design.pattern.command.stock.Stock;

public class CommandDemo {

    public static void main(String[] args) {

        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();


    }

}
