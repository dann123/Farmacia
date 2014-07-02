/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.farmacia.modelo;

/**
 *
 * @author alum.fial7
 */
public class Ventas {
    private int idVentas;
    private String estado;
    private String Fecha;
    private int NroVoletas;
    private Double MontoTotal;
    private Double IGV;
    private int Factura;
    private int Boleta;
    private Double SubTotal;

    public Ventas() {
    }

    public Ventas(String estado, String Fecha, int NroVoletas, Double MontoTotal, Double IGV, int Factura, int Boleta, Double SubTotal) {
        this.estado = estado;
        this.Fecha = Fecha;
        this.NroVoletas = NroVoletas;
        this.MontoTotal = MontoTotal;
        this.IGV = IGV;
        this.Factura = Factura;
        this.Boleta = Boleta;
        this.SubTotal = SubTotal;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getNroVoletas() {
        return NroVoletas;
    }

    public void setNroVoletas(int NroVoletas) {
        this.NroVoletas = NroVoletas;
    }

    public Double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(Double MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public Double getIGV() {
        return IGV;
    }

    public void setIGV(Double IGV) {
        this.IGV = IGV;
    }

    public int getFactura() {
        return Factura;
    }

    public void setFactura(int Factura) {
        this.Factura = Factura;
    }

    public int getBoleta() {
        return Boleta;
    }

    public void setBoleta(int Boleta) {
        this.Boleta = Boleta;
    }

    public Double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Double SubTotal) {
        this.SubTotal = SubTotal;
    }
    
         
}
