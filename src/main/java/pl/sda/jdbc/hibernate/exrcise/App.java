package pl.sda.jdbc.hibernate.exrcise;

import pl.sda.jdbc.hibernate.exrcise.entity.Customer;
import pl.sda.jdbc.hibernate.exrcise.entity.Orders;
import pl.sda.jdbc.hibernate.exrcise.service.OrdersService;

public class App {
    public static void main(String[] args) {
//        Customer customer = new Customer("Max", "Kolo", "France", "Paris", "44-505", "Mobaja", 69);
//        Orders orders = new Orders("17-08-2019", "Paris", customer);
        OrdersService ordersService = new OrdersService();
//        ordersService.ordersService(orders);
        System.out.println(ordersService.showAll())
        ;
    }
}
