package net.atos.apirest.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.UserRequest;
import net.atos.apirest.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	public UserController() {
		super();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/users")
	public UserEntity createUser(@Valid @RequestBody final UserRequest userRequest) throws Exception {		
			return userService.createUser(userRequest);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/users")
	public UserEntity updateUser(@Valid @RequestBody final UserRequest userRequest) throws Exception {		
			return userService.updateUser(userRequest);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/users")
	public void deleteUser(@Valid @RequestBody final UserRequest userRequest) throws Exception {		
		userService.deleteUser(userRequest);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/users")
	public  List<UserEntity> findAll() {
		return userService.findAll();
	}
	
}
