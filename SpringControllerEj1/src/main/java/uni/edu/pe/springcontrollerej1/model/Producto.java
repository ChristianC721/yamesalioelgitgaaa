package uni.edu.pe.springcontrollerej1.model;

public class Producto {
    private int codigo;
    private String descripcion;
    private String nombre;

    public Producto(int codigo, String descripcion, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
