package com.ici.db.repository;

import com.ici.db.model.User;
import org.hibernate.Session;
import com.ici.db.config.HibernateUtil;
import java.util.Date;

public class UserRepository {
    public static void addUser() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        //user.setUserId(1);  //no need this field if insert
        user.setUsername("PhongVT");
        user.setCreatedBy("Google");
        user.setCreatedDate(new Date());

        session.save(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("done, 1 row is inserted!");
    }
    public static void addUser(User usr) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        //user.setUserId(1);  //no need this field if insert
        user.setUsername(usr.getUsername());
        user.setCreatedBy(usr.getCreatedBy());
        user.setCreatedDate(usr.getCreatedDate());

        session.save(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("done, 1 row is inserted!");
    }
}
