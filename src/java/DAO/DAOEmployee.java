/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.AgenzUtil;
import POJO.TblEmployee;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ariiq Yusuf
 */
public class DAOEmployee{
    
    // Untuk menampilkan data ke tabel
    public List<TblEmployee> showAll () {
        List<TblEmployee> employee= new ArrayList();
        Transaction trans = null;
        Session session = AgenzUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblEmployee");
            employee = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return employee;
    }
    
    // Untuk mengambil data berdasarkan ID
     public List<TblEmployee> ShowByID(int id) {
        List<TblEmployee> employeeList = new ArrayList<TblEmployee>();

        Transaction trans = null;
        Session session = AgenzUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblEmployee where id=:id");
            query.setInteger("id", id);
            employeeList = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return employeeList;
    } 
     
     // Untuk mengambil data berdasarkan department
     public List<TblEmployee> ShowByName(String name) {
        List<TblEmployee> employee = new ArrayList<TblEmployee>();

        Transaction trans = null;
        Session session = AgenzUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblEmployee where name=:name");
            query.setString("name", name);
            
            employee = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return employee;
    }
     
    
    // untuk menambahkan data
    public void addEmployee(TblEmployee employee){
        Transaction transaction = null;
        Session session = AgenzUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    // untuk merubah data
    public void editEmployee(TblEmployee employee){
        Transaction transaction = null;
        Session session = AgenzUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    // untuk menghapus data
    public void deleteEmploye(int idEmployee){
        Transaction transaction = null;
        Session session = AgenzUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            TblEmployee emp = (TblEmployee) session.load(TblEmployee.class, new Integer(idEmployee));
            session.delete(emp);
            transaction.commit();
        } catch (Exception e) {
        }
    }
}
