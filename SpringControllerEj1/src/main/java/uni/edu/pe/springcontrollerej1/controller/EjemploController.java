package uni.edu.pe.springcontrollerej1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.springcontrollerej1.model.Producto;
import uni.edu.pe.springcontrollerej1.model.Saludo;

import java.util.ArrayList;
import java.util.List;

//antes de crear el Spring Initializr marcar las casillas de Lombok y en la de Web poner Spring Web
//esta forma de intercambiar mensajes solamente por http se llaman servicios rest

@RestController //esto se pone desde el teclado, no es automatico
public class EjemploController {

    @GetMapping("/hello") //tambien lo debes poner tu //en el navegador va http://localhost:8080/hello para que lo muestre
    public Saludo decirHola(){
        return new Saludo("Hola Mundo");
    }

    @GetMapping("/getProductos") //en el navegador va http://localhost:8080/getProductos para que lo muestre
    public List<Producto> recuperarProductos(){
        return obtenerProductos();
    }

    private List<Producto> obtenerProductos(){
        List<Producto> productos = new ArrayList<>();
        Producto p1 = new Producto(1,"Galleta de soda con chocolate", "chokosoda");
        Producto p2 = new Producto(2,"Eleva tu vida", "agua cielo");
        Producto p3 = new Producto(3,"No le gusta a Christiano Ronaldo", "Coca cola");
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        return productos;
    }
}
