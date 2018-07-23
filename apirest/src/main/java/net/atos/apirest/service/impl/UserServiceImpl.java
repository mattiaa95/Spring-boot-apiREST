package net.atos.apirest.service.impl;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.atos.apirest.model.converter.Converter;
import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.UserRequest;
import net.atos.apirest.repository.UserRepository;
import net.atos.apirest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	public UserServiceImpl() {

	}

	@Override
	public UserEntity createUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUsername(userRequest.getUsername())) {
			throw new Exception("Existe_Usuario");
		} else {
			if(isNotAdult(userRequest)) {
				throw new Exception("Usuario_Menor");	                               
			}else {
				return userRepository.save(Converter.userRequestToUserEntity(userRequest));
			}
		}
	}

	@Override
	public UserEntity updateUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUsername(userRequest.getUsername())) {
			if(isNotAdult(userRequest)) {
				throw new Exception("Usuario_Menor");	                               
			}else {
				return userRepository.save(Converter.userRequestToUserEntity(userRequest));
			}
		} else {
			throw new Exception("No_Existe_Usuario");
		}
	}

	@Override
	public void deleteUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUsername(userRequest.getUsername())) {
			userRepository.delete(Converter.userRequestToUserEntity(userRequest));
		} else {
			throw new Exception("No_Existe_Usuario");
		}
	}
	
	@Override
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}
	
	private boolean isNotAdult(UserRequest userRequest) {
		return LocalDate.now().atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli()-userRequest.getDate().getTime() < 568024200000L;                
	}

}
