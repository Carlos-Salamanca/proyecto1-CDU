package co.edu.unicauca.adminCDU.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="Escenario")
public class Escenario {

	@Id
	@Column(name="escenarioNombre", length=50)
	private String escenarioNombre;
	
	@Column(name="escenarioDescripcion ", length=200)
	private String escenarioDescripcion ;
	
	@Column(name="escenarioFoto")
	private String escenarioFoto;
	
	@Column(name="escenarioEstado", length=1)
	private char escenarioEstado;
	
	@Column(name="url", length = 50)
	private String escenarioUrl;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="categoriaNombre")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Categoria categoria;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "escenario")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Set<Horario> horario = new HashSet<>();

	public Escenario() {
		super();
	}

	public String getEscenarioNombre() {
		return escenarioNombre;
	}

	public void setEscenarioNombre(String escenarioNombre) {
		this.escenarioNombre = escenarioNombre;
	}

	public String getEscenarioDescripcion() {
		return escenarioDescripcion;
	}

	public void setEscenarioDescripcion(String escenarioDescripcion) {
		this.escenarioDescripcion = escenarioDescripcion;
	}

	public String getEscenarioFoto() {
		return escenarioFoto;
	}

	public void setEscenarioFoto(String escenarioFoto) {
		this.escenarioFoto = escenarioFoto;
	}

	public char getEscenarioEstado() {
		return escenarioEstado;
	}

	public void setEscenarioEstado(char escenarioEstado) {
		this.escenarioEstado = escenarioEstado;
	}

	public String getEscenarioUrl() {
		return escenarioUrl;
	}

	public void setEscenarioUrl(String escenarioUrl) {
		this.escenarioUrl = escenarioUrl;
	}

	public Categoria getEscenarioCategoria() {
		return categoria;
	}

	public void setEscenarioCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<Horario> getHorario() {
		return horario;
	}

	public void setHorario(Set<Horario> horario) {
		this.horario = horario;
	}
	
	
}
