
package Servicios;

import Excepciones.PersonalizedException;
import Persistencia.FabricanteDao;
import Persistencia.ProductoDao;


public class FabricanteServicio {
       public void agregarFabricante(String nombre) throws Exception{
        FabricanteDao fd = new FabricanteDao();
        try {
            fd.insertCreateMaker(nombre);
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }
        
    }
}
