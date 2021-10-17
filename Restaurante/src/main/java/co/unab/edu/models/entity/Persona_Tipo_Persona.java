package co.unab.edu.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="persona_tipo_persona")
public class Persona_Tipo_Persona {
	@Id
    @Column(name="id_consecutivo")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idconsecutivo;
	

	@Column(name="id_per")
	private String idper;
	
	@ManyToOne
	@JoinColumn(name="id_tip_fk")
	Tipo_Persona idtipfk;
	@Column(name = "nom_per")
	private String nomper;
	
	@Column(name = "ape_per")
	private String apeper;
	@Column(name="dir_per")
	private String dirper;
	@Column(name="telefono_per")
	private String telefonoper;
	@Column(name="email_per")
	private String emailper;
	@Column(name="fecha_reg")
	private String fechareg;
	
	
	public String getIdper() {
		return idper;
	}
	
	public void setIdper(String idper) {
		this.idper = idper;
	}
	
	public Integer getIdconsecutivo() {
		return idconsecutivo;
	}

	public void setIdconsecutivo(Integer idconsecutivo) {
		this.idconsecutivo = idconsecutivo;
	}

	
	public Tipo_Persona getIdtipfk() {
		return idtipfk;
	}
	public void setIdtipfk(Tipo_Persona idtipfk) {
		this.idtipfk = idtipfk;
	}
	public String getNomper() {
		return nomper;
	}
	public void setNomper(String nomper) {
		this.nomper = nomper;
	}
	public String getApeper() {
		return apeper;
	}
	public void setApeper(String apeper) {
		this.apeper = apeper;
	}
	public String getDirper() {
		return dirper;
	}
	public void setDirper(String dirper) {
		this.dirper = dirper;
	}
	public String getTelefonoper() {
		return telefonoper;
	}
	public void setTelefonoper(String telefonoper) {
		this.telefonoper = telefonoper;
	}
	public String getEmailper() {
		return emailper;
	}
	public void setEmailper(String emailper) {
		this.emailper = emailper;
	}
	public String getFechareg() {
		return fechareg;
	}
	public void setFechareg(String fechareg) {
		this.fechareg = fechareg;
	}

	@Override
	public String toString() {
		return "Persona_Tipo_Persona [idconsecutivo=" + idconsecutivo + ", idper=" + idper + ", idtipfk=" + idtipfk
				+ ", nomper=" + nomper + ", apeper=" + apeper + ", dirper=" + dirper + ", telefonoper=" + telefonoper
				+ ", emailper=" + emailper + ", fechareg=" + fechareg + "]";
	}
	
	
	
	

}
