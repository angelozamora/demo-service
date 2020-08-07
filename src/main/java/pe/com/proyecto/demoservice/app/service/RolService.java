package pe.com.proyecto.demoservice.app.service;

import pe.com.proyecto.demoservice.api.models.Resultado;
import pe.com.proyecto.demoservice.api.models.Rol;
import pe.com.proyecto.demoservice.api.models.Roles;

public interface RolService {
	
	Roles obtenerRoles();
	Roles obtenerRolxId(String id);
	
	Roles registrarRol(Rol rol);
	Resultado eliminarRolxId(String id);
	
}
