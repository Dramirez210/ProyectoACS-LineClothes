
package modelo;

public class Paquete {
    private int idPaquete;
    private String codigo;
    private double peso;
    private String prioridad;
    private String cantidadArticulos;
    

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(String cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }
    
    
    
}
