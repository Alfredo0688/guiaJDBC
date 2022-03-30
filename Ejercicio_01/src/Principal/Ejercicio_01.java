
package Principal;

import Entidades.Fabricante;
import Entidades.Producto;
import Servicios.FabricanteServicio;
import Servicios.ProductoServicio;
import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_01 {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ProductoServicio PS = new ProductoServicio();
        FabricanteServicio FS = new FabricanteServicio();
        //Fabricante f = new Fabricante(10,"Sony");
        //Producto p = PS.crearProducto(f);
        
        //System.out.println(p.getCodigo() + " " +p.getNombre()+" "+ p.getPrecio()+ " " + p.getFabricante().getCodigo());
//        try {
//            PS.agregarProducto();
//        } catch (Exception e) {
//        }
        
        try {
            System.out.print("Ingrese el nombre del fabricante: ");
            String nombreF = entrada.nextLine();
            FS.agregarFabricante(nombreF);
        } catch (Exception e) {
        }
        
    }
    
    
    
}
