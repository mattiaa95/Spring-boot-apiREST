package net.atos.apirest.model.converter;

import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.UserRequest;

public class Converter {

	public static UserEntity userRequestToUserEntity(UserRequest userRequest) {
		UserEntity userEntity = new UserEntity();
		userEntity.setName(userRequest.getName());
		userEntity.setUsername(userRequest.getUsername());
		userEntity.setEmail(userRequest.getEmail());
		userEntity.setDocument(userRequest.getDocument());
		userEntity.setDate(userRequest.getDate());
		return userEntity;
	}

}
