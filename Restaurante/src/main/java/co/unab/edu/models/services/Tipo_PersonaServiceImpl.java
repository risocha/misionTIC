package co.unab.edu.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.edu.models.entity.Tipo_Persona;
import co.unab.edu.repository.Tipo_PersonaRepository;

@Service
public class Tipo_PersonaServiceImpl implements Tipo_PersonaService{
	
	@Autowired
	private Tipo_PersonaRepository tipo_personaRepository;
	

	@Override
	public List<Tipo_Persona> findAll() {
		return tipo_personaRepository.findAll();
	}

	@Override
	public Optional<Tipo_Persona> findById(Integer id) {
		return tipo_personaRepository.findById(id);
	}

	@Override
	public Tipo_Persona save(Tipo_Persona tipo_persona) {
		return tipo_personaRepository.save(tipo_persona);
	}

	@Override
	public void deleteById(Integer id) {
		tipo_personaRepository.deleteById(id);
	}
	

}
