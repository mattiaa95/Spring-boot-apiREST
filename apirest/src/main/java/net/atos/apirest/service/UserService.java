package net.atos.apirest.service;



import java.util.List;

import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.UserRequest;



public interface UserService {

	/**
	 * Método para la creacion de un usuario por defecto.
	 * @param UserRequest
	 * @throws Exception 
	 */
	public UserEntity createUser(UserRequest userRequest) throws Exception;
	/**
	 * Método que devuelve todos los usuarios.
	 * @return
	 */
	public List<UserEntity> findAll();
	/**
	 * Método para actualizar usuarios.
	 * @param UserRequest
	 * @throws Exception 
	 */
	public UserEntity updateUser(UserRequest userRequest) throws Exception;
	/**
	 * Método para borrar usuarios.
	 * @param UserRequest
	 * @throws Exception 
	 */
	public void deleteUser(UserRequest userRequest) throws Exception;

}
