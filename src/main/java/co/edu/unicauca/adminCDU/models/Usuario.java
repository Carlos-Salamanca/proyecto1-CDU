package co.edu.unicauca.adminCDU.models;

import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@Column(name="id")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="documento", length = 20)
	private String documento;
	
	@Column(name="tipoDocumento", length = 2)
	private String tipoDocumento;
	
	@Column(name="primerNombre", length = 50)
	private String primerNombre;
	
	@Column(name="segundoNombre", length = 50)
	private String segundoNombre;
	
	@Column(name="primerApellido", length = 50)
	private String primerApellido;
	
	@Column(name="segundoApellido", length = 50)
	private String segundoApellido;
	
	@Column(name="genero", length = 1)
	private String genero;
	
	@Column(name="fechaNacimiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date fechaNacimiento;
	
	@Column(name="username", length = 25)
	private String username;
	
	@Column(name="password", length = 100)
	private String password;
	
	@Column(name="tipoUsuario", length = 50)
	private String tipoUsuario;
	
	@Column(name="email", length = 50)
	private String email;
	
	@Column(name="telefono", length = 20)
	private String telefono;
	
	@Column(name="foto")
	private Blob foto;
	
	@Column(name="fotPrefix", length = 50)
	private String fotPrefix;
	
	@Column(name="estado", length = 1)
	private int estado;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name="fechaCreacion")
	private Date fechaCreacion;
	
	
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Set<Horario> horario = new HashSet<>();
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

	public String getFotPrefix() {
		return fotPrefix;
	}

	public void setFotPrefix(String fotPrefix) {
		this.fotPrefix = fotPrefix;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Set<Horario> getHorario() {
		return horario;
	}

	public void setHorario(Set<Horario> horario) {
		this.horario = horario;
	}
	
}
