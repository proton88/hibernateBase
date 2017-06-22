package com.suhlob.hibernate;

import com.suhlob.hibernate.entity.User;
import com.suhlob.hibernate.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        //sessionFactory.close();
        //sessionFactory.openSession().save(User.class);
    }

}
