package org.example.store.dao;

import org.example.store.model.Money;
import org.example.store.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MoneyDao {
        public Money findById(int id) {
            return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Money.class, id);
        }
        public void save(Money money) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.save(money);
            tx1.commit();
            session.close();
        }
        public void update(Money money) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.update(money);
            tx1.commit();
            session.close();
        }
        public void delete(Money money) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.delete(money);
            tx1.commit();
            session.close();
        }
        public List<Money> findAll() {
            List<Money> money = (List<Money>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From User").list();
            return money;
        }

}
