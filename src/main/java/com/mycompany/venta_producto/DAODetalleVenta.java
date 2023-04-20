/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta_producto;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.time.LocalDate;

/**
 *
 * @author irvin
 */
public class DAODetalleVenta implements IDAOGeneral<DetalleVenta, Long> {

    LocalDate fechaActual = LocalDate.now();
    DAOProducto daoprod = new DAOProducto();

    @Override
    public DetalleVenta create(DetalleVenta p) {

        try ( Session session = HibernateUtil.getSession()) {

            Transaction t = session.beginTransaction();
            Producto prod = session.get(Producto.class, p.getClave());

            if (prod != null) {
                String nombre = daoprod.findById(p.getClave()).getNombre();
                p.setProducto(nombre);
                Long subtotal = p.getCantidad() * p.getPrecio();
                Long iva = (subtotal * 16) / 100;
                Long total = (subtotal + iva);
                p.setSubtotal(subtotal);
                p.setIva(iva);
                p.setTotal(total);
                session.save(p);
            } else {
                Logger.getLogger(DAODetalleVenta.class.getName()).log(Level.INFO, "El producto no existe");
            }

            Logger.getLogger(DAODetalleVenta.class.getName()).log(Level.INFO, "Se guardó el detalle de venta");
            t.commit();
            session.close();

        } catch (HibernateException ex) {
            Logger.getLogger(DAODetalleVenta.class.getName());

        }
        return p;
    }

    @Override
    public boolean delete(Long id) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        DetalleVenta obj = session.get(DetalleVenta.class,
                id);

        if (obj != null) {
            session.delete(obj);
            t.commit();
            session.close();
            return true;
        } else {
            t.rollback();
            session.close();
            return false;
        }
    }

    @Override
    public DetalleVenta update(DetalleVenta p, Long id) {
        try {
            DetalleVenta obj;
            try ( Session session = HibernateUtil.getSession()) {
                Transaction t = session.beginTransaction();
                obj = session.get(DetalleVenta.class,
                        id);
                obj.setCantidad(p.getCantidad());
                obj.setPrecio(p.getPrecio());
                obj.setSubtotal(p.getSubtotal());
                session.update(obj);
                t.commit();
            }

            return obj;

        } catch (HibernateException ex) {
            Logger.getLogger(DAODetalleVenta.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public List<DetalleVenta> findAll() {
        Session session= HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        List<DetalleVenta> lstProd=
                session.createQuery("from DetalleVenta", DetalleVenta.class).list();
        t.commit();
        session.close();
        return lstProd;
        
    }

    @Override
    public DetalleVenta findById(Long id) {
        DetalleVenta obj;
        try ( Session session = HibernateUtil.getSession()) {
            Transaction t = session.beginTransaction();
            obj
                    = session.get(DetalleVenta.class,
                            id);
            //get es para obtener un objeto referenciado, ya sea qu exista o sea null
            //load es para obtener en caché
            t.commit();
            session.close();

        }

        return obj;
    }

}
