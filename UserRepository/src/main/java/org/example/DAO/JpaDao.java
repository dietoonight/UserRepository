package org.example.DAO;

import org.example.HibernateSessionFactoryUtil;
import org.example.Profiles.JpaUserRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class JpaDao{
    public JpaUserRepository getById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(JpaUserRepository.class, id);
    }

    public List<JpaUserRepository> getAll(){
        List<JpaUserRepository> jpaUserRepositories = (List<JpaUserRepository>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From users").list();
        return jpaUserRepositories;
    }

    public void add(JpaUserRepository user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(JpaUserRepository user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }
    public void delete(JpaUserRepository user){
       Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
       Transaction tx1 = session.beginTransaction();
       session.delete(user);
       tx1.commit();
       session.close();
    }
}
