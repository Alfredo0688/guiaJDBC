
package Persistencia;

import Excepciones.PersonalizedException;


public class FabricanteDao extends DAO {
     //g)    Ingresar un producto a la base de datos.
    public void insertCreateMaker(String nombre) throws Exception{
        
        try {
            String template = "INSERT INTO fabricante VALUES(NULL,'%s')";
            String sql = String.format(template, nombre);
            insertModifyDelete(sql);
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }finally{
            disconnectDatabase();
        }
        
        }
}
