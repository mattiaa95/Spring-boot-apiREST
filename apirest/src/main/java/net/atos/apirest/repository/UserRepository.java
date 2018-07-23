package net.atos.apirest.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.atos.apirest.model.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Serializable> {


	boolean existsByUsername(String username);


	

}
