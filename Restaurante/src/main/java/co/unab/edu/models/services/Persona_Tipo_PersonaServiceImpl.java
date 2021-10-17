package co.unab.edu.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.edu.models.entity.Persona_Tipo_Persona;
import co.unab.edu.repository.Persona_Tipo_PersonaRepository;

@Service
public class Persona_Tipo_PersonaServiceImpl implements Persona_Tipo_PersonaService {
	
	@Autowired
	private Persona_Tipo_PersonaRepository persona_tipo_personaRepository;
	

	@Override
	public List<Persona_Tipo_Persona> findAll() {
		return persona_tipo_personaRepository.findAll();
	}

	@Override
	public Optional<Persona_Tipo_Persona> findById(Integer id) {
		return persona_tipo_personaRepository.findById(id);
	}

	@Override
	public Persona_Tipo_Persona save(Persona_Tipo_Persona persona_tipo_persona) {
		return persona_tipo_personaRepository.save(persona_tipo_persona);
	}

	@Override
	public void deleteById(Integer id) {
		persona_tipo_personaRepository.deleteById(id);
	}
}
