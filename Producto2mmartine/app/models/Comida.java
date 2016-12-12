package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import play.data.validation.Constraints;

@Entity 
public class Comida extends Model{
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String nombre;
    

    @Constraints.Required
    public String sabor;
    

    @Constraints.Required
    public String tamanio;
    
    @Constraints.Required
    public long precio;
    
    public static Find<Long,Comida> find=new Find<Long, Comida>(){};
	   

	public static List<Comida> listadoComida() {
		return find.all();
	}
    
    
}
