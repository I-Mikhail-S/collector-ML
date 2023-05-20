package org.example.store.utils;

import org.example.store.model.Auto;
import org.example.store.model.Money;
import org.example.store.model.Terminal;
import org.example.store.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration().addAnnotatedClass(User.class).addAnnotatedClass(Auto.class)
                    .setProperty(Environment.DRIVER, "org.postgresql.Driver")
                    .setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/Collector")
                    .setProperty(Environment.USER, "postgres")
                    .setProperty(Environment.PASS, "@@@@@@@")
                    .setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect")
                    .setProperty(Environment.SHOW_SQL, "false")
                    .setProperty(Environment.HBM2DDL_AUTO, "update");
            try {
                sessionFactory = configuration.buildSessionFactory();

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}
