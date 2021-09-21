package suedu.ciclo3backend;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.DAO.ciclo3bakend.ClienteDAO;
import co.edu.DTO.ciclo3backend.*;

@RestController
public class ClienteController {
	/**
	 * recibe la peticion para el listado de clientes
	 * @return
	 */
	@RequestMapping("/listaClientes")
	public ArrayList<ClienteVO> listaDeClientes(){
		ClienteDAO dao = new ClienteDAO();
		
		return dao.listaDeClientes();
	}
	
	/**
	 * Peticion para buscar un cliente por su ID
	 * @param id
	 * @return
	 */
	@RequestMapping("/traerCliente")
	public ArrayList<ClienteVO> buscarCliente(String id){
		ClienteDAO dao = new ClienteDAO();
		return dao.listaDeClientes();
	}
	
	/**
	 * Crea un nuevo cliente en la base de datos
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @return
	 */
	/*
	@RequestMapping("/crearCliente")
      public boolean crearCliente(String id, String nombre, String apellido) {
		ClienteVO cliente = new ClienteVO();
		cliente.setIdCliente(Long.parseLong(id));
		cliente.setNombreCliente(nombre);
		cliente.setApellidoCliente(apellido);
		
		ClienteDAO dao = new ClienteDAO();
		return dao.crearCliente(cliente);
	}
	*/
	/**
	 * Actualiza el nombre y el apellido de un cliente, de acuerdo a su ID
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @return
	 */
//	
	/*
	@RequestMapping("/actualizarCliente")
	public boolean actualizarCliente(String id, String nombre, String apellido) {
		ClienteVO cliente = new ClienteVO();
		cliente.setIdCliente(Long.parseLong(id));
		cliente.setNombreCliente(nombre);
		cliente.setApellidoCliente(apellido);
		
		ClienteDAO dao = new ClienteDAO();		
		return dao.actualizarCliente(cliente);
	}*/
	
	/**
	 * Elimina un cliente de acuerdo a su ID
	 * @param id
	 * @return
	 */
	/*
	@RequestMapping("/borrarCliente")
	public boolean borrarCliente(String id) {
		ClienteDAO dao = new ClienteDAO();	
		return dao.borrarCliente(Long.parseLong(id));
	}*/
}