package co.unab.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.unab.edu.models.entity.Tipo_Persona;

@Repository
public interface Tipo_PersonaRepository extends JpaRepository<Tipo_Persona, Integer>{
	

}
