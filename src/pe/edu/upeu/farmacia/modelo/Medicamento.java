/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.farmacia.modelo;

/**
 *
 * @author Nestor
 */
public class Medicamento {
    private int idMedicamento;
    private String Nombre;
    private String Descripcion;
    private int Stock;
    private Double Precio;

    public Medicamento() {
    }

    public Medicamento(String Nombre, String Descripcion, int Stock, Double Precio) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.Precio = Precio;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }
    
    
}
