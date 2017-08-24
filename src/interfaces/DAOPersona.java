package interfaces;

import MC_50_57.PersonaBD51;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public interface DAOPersona {
    public void registrar(PersonaBD51 per)throws Exception;
    public void modificar(PersonaBD51 per)throws Exception;
    public void eliminar(PersonaBD51 per)throws Exception;
    public List<PersonaBD51> listar() throws Exception;
}