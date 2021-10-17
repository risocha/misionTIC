package co.unab.edu.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tipo_persona")

public class Tipo_Persona {
    @Id
    @Column(name="id_tip")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idtip;
    
    @Column(name="descripcion_tp")
	private String descripciontp;

	public Integer getIdtip() {
		return idtip;
	}

	public void setIdtip(Integer idtip) {
		this.idtip = idtip;
	}

	public String getDescripciontp() {
		return descripciontp;
	}

	public void setDescripciontp(String descripciontp) {
		this.descripciontp = descripciontp;
	}

	@Override
	public String toString() {
		return "Tipo_Persona [idtip=" + idtip + ", descripciontp=" + descripciontp + "]";
	}

}
