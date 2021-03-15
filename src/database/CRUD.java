
package database;

import java.util.List;

public interface CRUD {
    
    public Object insertar(Object obj);
    
    public Object actualizar(Object obj);
    
    public Object eliminar (Object obj);
    
    public List<Object> listar();
    
    public Object listarUno(Object obj);
    
}
