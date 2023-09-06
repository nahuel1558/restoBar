/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nahue
 */
public class ProductoNoElaboradoDTO extends ProductoDTO{
    
    private int stock;

    public ProductoNoElaboradoDTO(int stock, String nombre, String descripcion, Float precio, Float costo) {
        super(nombre, descripcion, precio, costo);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
