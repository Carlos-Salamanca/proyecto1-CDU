package co.edu.unicauca.adminCDU.models;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class HorarioPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="horarioHoraInicio")
	private int horarioHoraInicio;
	
	@Column(name="horarioHoraFin")
	private int horarioHoraFin;
	
	@Column(name="horarioDia", length = 9)
	private String horarioDia; 
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name="horarioFechaInicio")
	private Date horarioFechaInicio;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name="horarioFechaFin")
	private Date horarioFechaFin;
	
	public HorarioPK() {
		super();
	}

	public HorarioPK(int horarioHoraInicio, int horarioHoraFin, String horarioDia, Date horarioFechaInicio,
			Date horarioFechaFin) {
		super();
		this.horarioHoraInicio = horarioHoraInicio;
		this.horarioHoraFin = horarioHoraFin;
		this.horarioDia = horarioDia;
		this.horarioFechaInicio = horarioFechaInicio;
		this.horarioFechaFin = horarioFechaFin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horarioDia, horarioFechaFin, horarioFechaInicio, horarioHoraFin, horarioHoraInicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HorarioPK other = (HorarioPK) obj;
		return Objects.equals(horarioDia, other.horarioDia) && Objects.equals(horarioFechaFin, other.horarioFechaFin)
				&& Objects.equals(horarioFechaInicio, other.horarioFechaInicio)
				&& horarioHoraFin == other.horarioHoraFin && horarioHoraInicio == other.horarioHoraInicio;
	}

	public int getHorarioHoraInicio() {
		return horarioHoraInicio;
	}

	public void setHorarioHoraInicio(int horarioHoraInicio) {
		this.horarioHoraInicio = horarioHoraInicio;
	}

	public int getHorarioHoraFin() {
		return horarioHoraFin;
	}

	public void setHorarioHoraFin(int horarioHoraFin) {
		this.horarioHoraFin = horarioHoraFin;
	}

	public String getHorarioDia() {
		return horarioDia;
	}

	public void setHorarioDia(String horarioDia) {
		this.horarioDia = horarioDia;
	}

	public Date getHorarioFechaInicio() {
		return horarioFechaInicio;
	}

	public void setHorarioFechaInicio(Date horarioFechaInicio) {
		this.horarioFechaInicio = horarioFechaInicio;
	}

	public Date getHorarioFechaFin() {
		return horarioFechaFin;
	}

	public void setHorarioFechaFin(Date horarioFechaFin) {
		this.horarioFechaFin = horarioFechaFin;
	}
	
	//----------------- Metodos para convertir a string las fechas ---------------
	
	public String convertirHorarioFechaInicio() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = getHorarioFechaInicio();
		String cadena = dateFormat.format(date);
		
//		System.out.println("***** "+cadena);
		return cadena;
	}
	
	public String convertirHorarioFechaFin() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = getHorarioFechaFin();
		String cadena = dateFormat.format(date);
		
//		System.out.println("***** "+cadena);
		return cadena;
	}
}
