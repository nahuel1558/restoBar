
package model;

import java.util.List;


public class MesaDTO {
    private String nombre;
    private List<PedidoDTO> pedidos;
    
    public MesaDTO(List<PedidoDTO> pedidos, String nombre) {
        this.pedidos = pedidos;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PedidoDTO> getPedidos(){
        return pedidos;
    }
    public void setPedidos (List<PedidoDTO> pedidos){
        this.pedidos = pedidos;
    }
    
}
