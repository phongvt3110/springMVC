package com.ici.db.repository;

import com.ici.db.config.HibernateUtil;
import com.ici.db.model.User;
import org.hibernate.Session;

public class UserRepository {
    public static void addUser( User usr){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();

        //user.setUserId(1);  //no need this field if insert
        user.setUsername(usr.getUsername());
        user.setCreatedBy(usr.getCreatedBy());
        user.setCreatedDate(usr.getCreatedDate());

        session.save(user);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        System.out.println("done");
    }
}
