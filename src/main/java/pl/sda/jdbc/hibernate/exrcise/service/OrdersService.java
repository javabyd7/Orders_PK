package pl.sda.jdbc.hibernate.exrcise.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.jdbc.hibernate.exrcise.config.HibernateUtils;
import pl.sda.jdbc.hibernate.exrcise.entity.Orders;

public class OrdersService {
    public Orders ordersService (Orders orders){
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(orders);
        transaction.commit();
        HibernateUtils.closeConnection();
        return orders;
    }
}
