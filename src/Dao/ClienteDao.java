package Dao;


import Dto.Cliente;
import Util.Conexion;

public class ClienteDao extends Conexion<Cliente>
implements GenericDao<Cliente>{

	public ClienteDao() {
		// TODO Auto-generated constructor stub
		super(Cliente.class);
	}

}
