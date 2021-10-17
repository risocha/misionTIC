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

import co.unab.edu.models.entity.Tipo_Persona;
import co.unab.edu.models.services.Tipo_PersonaService;

@RestController
@RequestMapping("/api/tipo_persona")
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class Tipo_PersonaController {
	
	@Autowired
	private Tipo_PersonaService tipo_personaService;
	@GetMapping("{id}")
	public Optional<Tipo_Persona> buscarPorId(@PathVariable Integer id){
		
		return tipo_personaService.findById(id);
		
	}
	@GetMapping("/listar")
	public List<Tipo_Persona> listar(){
		
		return tipo_personaService.findAll();
		
	}
	@CrossOrigin(origins="http://localhost:8081")
	@PostMapping
	public Tipo_Persona guardar(@RequestBody Tipo_Persona tipo_persona) {
		
		return tipo_personaService.save(tipo_persona);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		
		tipo_personaService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	
	public Tipo_Persona actualizar(@RequestBody Tipo_Persona tipo_persona,@PathVariable Integer id) {
		Tipo_Persona eEnBD=tipo_personaService.findById(id).get();
		eEnBD.setDescripciontp(tipo_persona.getDescripciontp());
		tipo_personaService.save(eEnBD);
		return tipo_persona;
	}
	
}
