package co.unab.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.unab.edu.models.entity.Persona_Tipo_Persona;


@Repository
public interface Persona_Tipo_PersonaRepository extends JpaRepository<Persona_Tipo_Persona, Integer>{

}
