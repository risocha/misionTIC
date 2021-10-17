package co.unab.edu.models.services;

import java.util.List;
import java.util.Optional;

import co.unab.edu.models.entity.Tipo_Persona;

public interface Tipo_PersonaService {

	public List<Tipo_Persona>findAll();
	public Optional<Tipo_Persona>findById(Integer id);
	public Tipo_Persona save(Tipo_Persona tipo_persona);
	public void deleteById(Integer id);
	
	
}
