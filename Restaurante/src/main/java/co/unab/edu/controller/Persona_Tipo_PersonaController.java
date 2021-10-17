package co.unab.edu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.unab.edu.models.entity.Persona_Tipo_Persona;
import co.unab.edu.models.services.Persona_Tipo_PersonaService;

@RestController
@RequestMapping("/api/persona_tipo_persona")
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class Persona_Tipo_PersonaController {
	@Autowired
	private Persona_Tipo_PersonaService persona_tipo_personaService;
	@GetMapping("{id}")
public Optional<Persona_Tipo_Persona> buscarPorId(@PathVariable Integer id){
		return persona_tipo_personaService.findById(id);
	}
@GetMapping("/listar")
public List<Persona_Tipo_Persona> listar(){
	return persona_tipo_personaService.findAll();
}

@CrossOrigin(origins="http://localhost:8081")
@PostMapping
public Persona_Tipo_Persona guardar(@RequestBody Persona_Tipo_Persona persona_tipo_persona) {
	
	return persona_tipo_personaService.save(persona_tipo_persona);
}

@DeleteMapping("{id}")
public void eliminar(@PathVariable Integer id) {
	
	persona_tipo_personaService.deleteById(id);
}

@PutMapping("/actualizar/{id}")

public Persona_Tipo_Persona actualizar(@RequestBody Persona_Tipo_Persona persona_tipo_persona,@PathVariable Integer id) {
	Persona_Tipo_Persona eEnBD=persona_tipo_personaService.findById(id).get();
	eEnBD.setIdper(persona_tipo_persona.getIdper());
	eEnBD.setIdtipfk(persona_tipo_persona.getIdtipfk());
	eEnBD.setNomper(persona_tipo_persona.getNomper());
	eEnBD.setApeper(persona_tipo_persona.getApeper());
	eEnBD.setDirper(persona_tipo_persona.getDirper());
	eEnBD.setTelefonoper(persona_tipo_persona.getTelefonoper());
	eEnBD.setEmailper(persona_tipo_persona.getEmailper());
	eEnBD.setFechareg(persona_tipo_persona.getFechareg());
	persona_tipo_personaService.save(eEnBD);
	return persona_tipo_persona;
}

	

}
