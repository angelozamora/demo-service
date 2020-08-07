package pe.com.proyecto.demoservice.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.proyecto.demoservice.app.jpa.RolJpa;



@Repository
public interface RolRepository extends CrudRepository<RolJpa, Long>{
	
	RolJpa findById(long id);
	boolean existsByRol(String rol);
	
}
