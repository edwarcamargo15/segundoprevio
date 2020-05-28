package Dao;

import Dto.Servicio;
import Dto.Tienda;
import Util.Conexion;

public class TiendaDao extends Conexion<Tienda>
implements GenericDao<Tienda>{


	public TiendaDao() {
		// TODO Auto-generated constructor stub
		super(Tienda.class);
	}

}
