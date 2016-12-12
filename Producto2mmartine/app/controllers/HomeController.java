package controllers;

import java.util.List;


import models.Comida;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	public Result index() {
    	List<Comida> comida=Comida.listadoComida();
    	
        return ok(index.render(Comida.listadoComida()));
        
    }

}
