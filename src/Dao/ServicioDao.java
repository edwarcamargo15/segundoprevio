package Dao;

import Dto.Servicio;
import Util.Conexion;

public class ServicioDao extends Conexion<Servicio>
implements GenericDao<Servicio>{

	public ServicioDao() {
		// TODO Auto-generated constructor stub
		super(Servicio.class);
	}

}
