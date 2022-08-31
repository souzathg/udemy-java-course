package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;


public class Enumerations {
    public static void main(String[] args) {
        Order order = new Order(1079, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("delivered".toUpperCase());
        System.out.println("os1 = " + os1);
        System.out.println("os2 = " + os2);
    }
}
