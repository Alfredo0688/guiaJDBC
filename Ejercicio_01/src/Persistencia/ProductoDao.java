
package Persistencia;

import Entidades.Producto;
import Excepciones.PersonalizedException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao extends DAO {
    
    //a)   Lista el nombre de todos los productos que hay en la tabla producto. 
    public List<Producto> getProductsNames() throws PersonalizedException, Exception {
       
        try {
            String sql = "SELECT nombre FROM producto;";
            queryDatabase(sql);

            List<Producto> products = new ArrayList<>();
            Producto product;

            while (resultSet.next()) {
                product = new Producto();
                                            //el 2 se refiere al 2° campo de la tabla producto
                product.setNombre(resultSet.getString(2));

                products.add(product);
            }
            return products;
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }finally{
            disconnectDatabase();
        }
    }
    
    //b)  Lista los nombres y los precios de todos los productos de la tabla producto. 
        public List<Producto> getProductsNamesAndPrice() throws PersonalizedException, Exception {
       
        try {
            String sql = "SELECT nombre,precio FROM producto;";
            queryDatabase(sql);

            List<Producto> products = new ArrayList<>();
            Producto product;

            while (resultSet.next()) {
                product = new Producto();
                                            //el 2 se refiere al 2° campo de la tabla producto
                product.setNombre(resultSet.getString(2));
                product.setPrecio(resultSet.getDouble(3));
                products.add(product);
            }
            return products;
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }finally{
            disconnectDatabase();
        }
    }
        
    //c)   Listar aquellos productos que su precio esté entre 120 y 202. 
            public List<Producto> getProductsBeetwenPrice(double valorDesde,double valorHasta) throws PersonalizedException, Exception {
       
        try {
            String template = "SELECT nombre,precio FROM producto WHERE precio BEETWEN %s AND %s;";
            String sql = String.format(template, valorDesde,valorHasta);
            queryDatabase(sql);

            List<Producto> products = new ArrayList<>();
            Producto product;

            while (resultSet.next()) {
                product = new Producto();
                                            //el 2 se refiere al 2° campo de la tabla producto
                product.setNombre(resultSet.getString(2));
                product.setPrecio(resultSet.getDouble(3));
                products.add(product);
            }
            return products;
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }finally{
            disconnectDatabase();
        }
    }
            
    //d)  Buscar y listar todos los Portátiles de la tabla producto.       
        public List<Producto> getAllPortable() throws PersonalizedException, Exception {
       
        try {
            String sql = "SELECT nombre FROM producto WHERE nombre LIKE '%Pórtatil%';";
            queryDatabase(sql);

            List<Producto> products = new ArrayList<>();
            Producto product;

            while (resultSet.next()) {
                product = new Producto();
                                            //el 2 se refiere al 2° campo de la tabla producto
                product.setNombre(resultSet.getString(2));

                products.add(product);
            }
            return products;
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }finally{
            disconnectDatabase();
        }
    }
    
    //e)   Listar el nombre y el precio del producto más barato. 
           public List<Producto> getMostLowerPrice() throws PersonalizedException, Exception {
       
        try {
            String sql = "SELECT MIN(precio),nombre FROM producto;";
            queryDatabase(sql);

            List<Producto> products = new ArrayList<>();
            Producto product;

            while (resultSet.next()) {
                product = new Producto();
                                            //el 2 se refiere al 2° campo de la tabla producto
                product.setNombre(resultSet.getString(2));
                product.setPrecio(resultSet.getDouble(3));

                products.add(product);
            }
            return products;
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }finally{
            disconnectDatabase();
        }
    }
           
    //f)    Ingresar un producto a la base de datos.
    public void insertCreateProduct() throws Exception{
        try {
            String template = "INSERT INTO producto VALUES(NULL,'%s','%s','%s')";
            String sql = String.format(template, "celular","20000","5");
            insertModifyDelete(sql);
        } catch (Exception e) {
            throw new PersonalizedException("Error al obtener la lista de productos.");
        }finally{
            disconnectDatabase();
        }
        
        }
    }
           

    


