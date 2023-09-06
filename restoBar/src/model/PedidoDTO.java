/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;


public class PedidoDTO {
    private Date fechaApertura;
    private Date fechaCierre;
    private List<ItemDTO> pedidos;
    private Float descuento;

    public PedidoDTO(Date fechaApertura, Date fechaCierre, List<ItemDTO> pedidos, Float descuento) {
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.pedidos = pedidos;
        this.descuento = descuento;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public List<ItemDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<ItemDTO> pedidos) {
        this.pedidos = pedidos;
    }
    
    public Float getDescuento(){
        return descuento;
    }
    public void setDescuento (Float descuento){
        this.descuento = descuento;
    }
}
