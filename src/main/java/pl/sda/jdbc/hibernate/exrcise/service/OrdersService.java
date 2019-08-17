package pl.sda.jdbc.hibernate.exrcise.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.jdbc.hibernate.exrcise.config.HibernateUtils;
import pl.sda.jdbc.hibernate.exrcise.entity.Orders;

import java.util.List;

public class OrdersService {
    public Orders ordersService (Orders orders){
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(orders);
        transaction.commit();
        HibernateUtils.closeConnection();
        return orders;
    }

    public List<Orders> showAll(){
        Session session = HibernateUtils.getSession();
        List<Orders> orders = session.createQuery("select a from Orders a", Orders.class).getResultList();
        return orders;

    }
}
