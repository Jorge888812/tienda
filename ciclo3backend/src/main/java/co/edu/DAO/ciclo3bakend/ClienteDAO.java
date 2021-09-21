package co.edu.DAO.ciclo3bakend;

import java.sql.*;
import java.util.ArrayList;

import co.edu.DTO.ciclo3backend.*;
public class ClienteDAO {
	/**
	 * Permite consultar el listado de clientes
	 * @return
	 */
	public ArrayList<ClienteVO> listaDeClientes(){
		ArrayList<ClienteVO> misClientes = new ArrayList<ClienteVO>();
		Conexion conex = new Conexion();
		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM cliente");
			ResultSet res = consulta.executeQuery();
			
			while(res.next()){
				ClienteVO cliente = new ClienteVO();
				
				cliente.setIdCliente(res.getLong("idCliente"));
				cliente.setNombreCliente(res.getString("nombreCliente"));
				cliente.setApellidoCliente(res.getString("apellidoCliente"));
				misClientes.add(cliente);
			}
			res.close();
			consulta.close();
			conex.desconectar();
		}catch(Exception e) {
			System.out.println("No se pudo conectar");
		}
		return misClientes;
	}

}
