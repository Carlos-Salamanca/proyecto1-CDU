package co.edu.unicauca.adminCDU.models;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Horario")
public class Horario {
	
	@EmbeddedId
	private HorarioPK PK;
	
	@Column(name="horarioEstado", length = 1)
	private char horarioEstado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="programaId")
	private Programa programa;	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="escenarioNombre")
	private Escenario escenario;	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="id")
	private Usuario usuario;	

	public char getHorarioEstado() {
		return horarioEstado;
	}

	public Horario() {
		super();
	}

	public void setHorarioEstado(char horarioEstado) {
		this.horarioEstado = horarioEstado;
	}

	public Programa getHorarioPrograma() {
		return programa;
	}

	public void setHorarioPrograma(Programa programa) {
		this.programa = programa;
	}

	public HorarioPK getPK() {
		return PK;
	}

	public void setPK(HorarioPK pK) {
		PK = pK;
	}

	public Escenario getHorarioEscenario() {
		return escenario;
	}

	public void setHorarioEscenario(Escenario escenario) {
		this.escenario = escenario;
	}

	public Usuario getHorarioUsuario() {
		return usuario;
	}

	public void setHorarioUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
