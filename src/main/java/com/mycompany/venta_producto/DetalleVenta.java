/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta_producto;

/**
 *
 * @author irvin
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalleventa")

public class DetalleVenta {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idventa")
    private long ventaID;
    
    @Column(name = "clave_producto")
    private long clave;
    
    @Column(name = "producto")
    private String producto;

    @Column(name = "precio")
    private long precio;

    @Column(name = "cantidad")
    private long cantidad;

    @Column(name = "subtotal")
    private long subtotal;

    @Column(name = "total")
    private long total;
    
    @Column(name = "iva")
    private long iva;

    public long getVentaID() {
        return ventaID;
    }

    public void setVentaID(long ventaID) {
        this.ventaID = ventaID;
    }
    
    public long getIva() {
        return iva;
    }

    public void setIva(long iva) {
        this.iva = iva;
    }
    
    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
    
    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

}
