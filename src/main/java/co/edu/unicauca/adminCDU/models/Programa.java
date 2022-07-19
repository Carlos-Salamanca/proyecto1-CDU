package co.edu.unicauca.adminCDU.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="Programa")
public class Programa {
	
	@Id
	@Column(name="programaId")
	private int programaId;
	
	@Column(name="programaNombre")
	private String programaNombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "programa")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Set<Horario> horario = new HashSet<>();

	public Programa() {
		super();
	}

	public int getProgramaId() {
		return programaId;
	}

	public void setProgramaId(int programaId) {
		this.programaId = programaId;
	}

	public String getProgramaNombre() {
		return programaNombre;
	}

	public void setProgramaNombre(String programaNombre) {
		this.programaNombre = programaNombre;
	}

	public Set<Horario> getHorario() {
		return horario;
	}

	public void setHorario(Set<Horario> horario) {
		this.horario = horario;
	}
	
	
}
