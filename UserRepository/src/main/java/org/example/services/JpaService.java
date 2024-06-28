package org.example.services;

import org.example.DAO.JpaDao;
import org.example.Profiles.JpaUserRepository;

import java.util.List;

public class JpaService {
    private JpaDao jpaDao = new JpaDao();
    public JpaService(){

    }
    public JpaUserRepository getById(int id) {
        return jpaDao.getById(id);
    }
    public List<JpaUserRepository> getAll(){
        return jpaDao.getAll();
    }
    public void add(JpaUserRepository user){
        jpaDao.add(user);
    }
    public void update(JpaUserRepository user){
        jpaDao.update(user);
    }
    public void delete(JpaUserRepository user){
        jpaDao.delete(user);
    }
}
