package Util;

import Dao.ClienteDao;
import Dao.GenericDao;
import Dao.ServicioDao;
import Dao.TiendaDao;
import Dto.Cliente;
import Dto.Servicio;
import Dto.Tienda;



public class Controlador {

	public Controlador() {
		// TODO Auto-generated constructor stub
	}
	
	
public void crearTienda(String nombre,String lema,String descripcion,String email,String clave,String propietario,String facebook,String web,String imag){
		
	    Tienda t = new Tienda(nombre,lema,descripcion,email,clave,propietario,facebook,web,imag);
	    GenericDao<Tienda> usDao = new TiendaDao();
	    usDao.insert(t);

	}


public void crearCliente(String nombre,String email,String clave){
	
    Cliente t = new Cliente(nombre,email,clave);
    GenericDao<Cliente> usDao = new ClienteDao();
    usDao.insert(t);

}

public void crearServicio(String nombre,String descripcion){
	
    Servicio t = new Servicio(nombre,descripcion);
    GenericDao<Servicio> usDao = new ServicioDao();
    usDao.insert(t);

}

public void ActualizarTienda(String nombre,String lema,String descripcion,String email,String clave,String propietario,String facebook,String web,String imag) {
	Tienda u = new Tienda(nombre,lema,descripcion,email,clave,propietario,facebook,web,imag);
	GenericDao<Tienda> usDao= new TiendaDao();
	usDao.update(u);
	
}




}
