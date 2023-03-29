/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.AgenzUtil;
import POJO.TblAdmin;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ariiq Yusuf
 */
public class DAOLogin {
    public List<TblAdmin> getBy(String admEmail, String admPass) {
        Transaction trans = null;
        TblAdmin adm = new TblAdmin();
        List<TblAdmin> admin = new ArrayList();
        Session session = AgenzUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblAdmin where email=:admEmail AND password=:admPass");
            query.setString("admEmail", admEmail);
            query.setString("admPass", admPass);
            adm = (TblAdmin) query.uniqueResult();
            admin = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return admin;
    }
    
    public String add_admin(TblAdmin user){
        Transaction trans = null;
        Session session = AgenzUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(user);
            trans.commit();
            return "login";
        } catch (Exception e) {
            System.out.println(e);
        }
        return "signup_error";
    }
}
