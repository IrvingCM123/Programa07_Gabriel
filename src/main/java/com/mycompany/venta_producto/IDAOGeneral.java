/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.venta_producto;

import java.util.List;

/**
 *
 * @author Irving
 */
public interface IDAOGeneral <T,ID>{
    public T create(T P);
    public boolean delete(ID id);
    public T update(T p, ID id);
    
    public List<T> findAll();
    public T findById(ID id);
}
