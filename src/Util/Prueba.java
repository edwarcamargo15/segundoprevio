package Util;

import Dao.TiendaDao;
import Dto.Tienda;

public class Prueba {

	public static void main(String[] args) {
	
		
		Tienda ee= new TiendaDao();
		Tienda e = new Tienda("AUX","A","ASDADA","A@GMAIL.COM","XXXX","EDWAR CAMARGO","EDWAR","AXU.COM","ASDDASDA");
		ee.insert(e);
		
		//Controlador c= new Controlador();
		
		//c.crearTienda("AUX","A","ASDADA","A@GMAIL.COM","XXXX","EDWAR CAMARGO","EDWAR","AXU.COM","ASDDASDA");
		
	}

}
