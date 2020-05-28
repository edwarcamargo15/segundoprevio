package Util;

import Dao.ClienteDao;
import Dao.TiendaDao;
import Dto.Cliente;
import Dto.Tienda;

public class Prueba {

	public static void main(String[] args) {
	
		
		TiendaDao ee= new TiendaDao();
		Tienda e = new Tienda("TIENDA","ASDASD","SDFSDFSDF","ASD@GMAIL.COM","XXXX","EDWAR","EDWAR CAMARGO ","TIENDA.COM","WWW.TIENDA.COM");
		ee.insert(e);
		
		ClienteDao cc= new ClienteDao();
		Cliente c= new Cliente();
		
		
	}

}
