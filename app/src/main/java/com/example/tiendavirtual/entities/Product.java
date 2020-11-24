package com.example.tiendavirtual.entities;

public class Product {
    private int id;
    private String descripcion;
    private String codigo;
    private int preciocucq3;
    private int preciousd;
    private String producto;
    private int disponibilidad;

    public Product(String descripcion) {
        this.descripcion = descripcion;
        this.codigo = "32564";
        this.preciocucq3 = 50;
        this.preciousd = 30;
        this.producto = "Skinny jean";
        this.disponibilidad = 3;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPreciocucq3() {
        return preciocucq3;
    }

    public int getPreciousd() {
        return preciousd;
    }

    public String getProducto() {
        return producto;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }
}
