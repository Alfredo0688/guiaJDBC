
package Servicios;

import Entidades.Fabricante;
import Entidades.Producto;
import Excepciones.PersonalizedException;
import Persistencia.ProductoDao;
import java.util.Locale;
import java.util.Scanner;


public class ProductoServicio {
    
    
    public Producto crearProducto(Fabricante fabricante){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int idP = 0;
        System.out.print("Nombre Producto: ");
        String nombre = entrada.next();
        System.out.print("Precio Producto: ");
        Double precio = entrada.nextDouble();
        Producto producto = new Producto(idP,nombre, precio,fabricante);
        return producto;
    }
    
    public void agregarProducto() throws Exception{
        ProductoDao pd = new ProductoDao();
        try {
            pd.insertCreateProduct();
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }
        
    }
}
