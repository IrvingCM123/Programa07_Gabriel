/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta_producto;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Irving
 */
public class DAOProducto implements IDAOGeneral<Producto, Long> {

    @Override
    public Producto create(Producto P) {
        Session session= HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        session.save(P);
        t.commit();
        session.close();
        return P;
    }

    @Override
    public boolean delete(Long id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        boolean res;
        Producto producto = findById(id);
        if (producto == null) {
            res = false;
        } else {
            session.delete(producto);
            res = true;
        }
        tx.commit();
        session.close();
        return res;
 
    }

    @Override
    public Producto update(Producto p, Long id) {
       Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.update(p);
        t.commit();
        session.close();
        return p;
    }

    @Override
    public List<Producto> findAll() {
        Session session= HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        List<Producto> lstProd=
                session.createQuery("from Producto", Producto.class).list();
        t.commit();
        session.close();
        return lstProd;
        
    }

    @Override
    public Producto findById(Long id) {
        Session session= HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        Producto P=session.get(Producto.class, id);
        t.commit();
        session.close();
        return P;
    }
    
}
