package co.edu.unicauca.adminCDU.repositories;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.adminCDU.models.Horario;
import co.edu.unicauca.adminCDU.models.HorarioPK;
import co.edu.unicauca.adminCDU.services.IHorarioService;

@Service
public class HorarioRepository {

	@Autowired
	private IHorarioService hor;
	
	public List<Horario> findAll(){
		System.out.println("Invocando a listar horarios");
		return hor.findAll();
	}
	
	public Horario save(Horario horario) {
		System.out.println("Invocando a guardar horario");
		hor.save(horario);
		return horario;
	}
	
	public Horario findById(int horarioHoraInicio, int horarioHoraFin, String horarioDia, String FechaInicio,
			String FechaFin) throws ParseException {
		
		System.out.println("Invocando a buscar horario por id");
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date horarioFechaInicio = formato.parse(FechaInicio);
		Date horarioFechaFin = formato.parse(FechaFin);
		
		HorarioPK horarioPK = new HorarioPK(horarioHoraInicio, horarioHoraFin, horarioDia, horarioFechaInicio, horarioFechaFin);
		Horario horario = hor.findById(horarioPK).orElse(null);
		return horario;
	}
	
	public Horario delete(int horarioHoraInicio, int horarioHoraFin, String horarioDia, String FechaInicio,
			String FechaFin) throws ParseException {
		
		System.out.println("Invocando a eliminar horario por id");
		Horario horarioAux = findById(horarioHoraInicio, horarioHoraFin, horarioDia, FechaInicio, FechaFin);
		
		if(horarioAux != null) {			
			hor.delete(horarioAux);
		}
		return horarioAux;
	}
	
	public Horario upDate(int horarioHoraInicio, int horarioHoraFin, String horarioDia, String FechaInicio,
			String FechaFin, Horario horario) throws ParseException {
		
		System.out.println("Invocando a editar horario por id");
		
		Horario horarioAux = findById(horarioHoraInicio, horarioHoraFin, horarioDia, FechaInicio, FechaFin);
		if(horarioAux != null) {			
			horarioAux = hor.save(horario);
		}
		return horarioAux;
	}
}
