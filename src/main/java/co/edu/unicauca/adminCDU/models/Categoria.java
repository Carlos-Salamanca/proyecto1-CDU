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
@Table(name="Categoria")
public class Categoria {

	@Id
	@Column(name="categoriaNombre", length = 50)
	private String categoriaNombre;
	
	@Column(name="categoriaFoto", length = 50)
	private String categoriaFoto;
	
	@Column(name="categoriaDescripcion", length = 200)
	private String categoriaDescripcion;
	
	@Column(name="url", length = 50)
	private String categoriaUrl;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Set<Escenario> escenario = new HashSet<>();
	
	public Categoria() {
		super();
	}

	public String getCategoriaNombre() {
		return categoriaNombre;
	}

	public void setCategoriaNombre(String categoriaNombre) {
		this.categoriaNombre = categoriaNombre;
	}

	public String getCategoriaFoto() {
		return categoriaFoto;
	}

	public void setCategoriaFoto(String categoriaFoto) {
		this.categoriaFoto = categoriaFoto;
	}

	public String getCategoriaDescripcion() {
		return categoriaDescripcion;
	}

	public void setCategoriaDescripcion(String categoriaDescripcion) {
		this.categoriaDescripcion = categoriaDescripcion;
	}

	public String getCategoriaUrl() {
		return categoriaUrl;
	}

	public void setCategoriaUrl(String categoriaUrl) {
		this.categoriaUrl = categoriaUrl;
	}
	
}
