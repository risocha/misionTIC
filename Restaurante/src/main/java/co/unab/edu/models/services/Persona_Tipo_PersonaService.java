package co.unab.edu.models.services;

import java.util.List;
import java.util.Optional;

import co.unab.edu.models.entity.Persona_Tipo_Persona;


public interface Persona_Tipo_PersonaService {
	
	public List<Persona_Tipo_Persona>findAll();
	public Optional<Persona_Tipo_Persona>findById(Integer id);
	public Persona_Tipo_Persona save(Persona_Tipo_Persona persona_tipo_persona);
	public void deleteById(Integer id);

}
