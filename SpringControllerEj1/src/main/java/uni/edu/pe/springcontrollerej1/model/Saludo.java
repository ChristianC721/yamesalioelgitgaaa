package uni.edu.pe.springcontrollerej1.model;

public class Saludo {
    private String descripcion;

    public Saludo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
