package co.edu.unicauca.adminCDU.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.adminCDU.models.Horario;
import co.edu.unicauca.adminCDU.repositories.HorarioRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class HorarioRestController {

	@Autowired
	private HorarioRepository horRepo;
	
	@GetMapping("/horarios")
	public List<Horario> findAll(){
		List<Horario> lista = null;
		lista = this.horRepo.findAll();
		
		return lista;
	}
	
	@PostMapping("/horarios")
	public Horario create(@RequestBody Horario horario) {
		Horario hor = null;
		hor = this.horRepo.save(horario);
		return hor;
	}
	
	@GetMapping("/horarios/{horarioHoraInicio}/{horarioHoraFin}/{horarioDia}/{FechaInicio}/{FechaFin}")
	public Horario findById(@PathVariable int horarioHoraInicio, @PathVariable int horarioHoraFin, @PathVariable String horarioDia, @PathVariable String FechaInicio,
			@PathVariable String FechaFin) throws ParseException {
		
		Horario hor = null;
		hor = this.horRepo.findById(horarioHoraInicio, horarioHoraFin, horarioDia, FechaInicio, FechaFin);
		return hor;
	}
	
	@DeleteMapping("/horarios/{horarioHoraInicio}/{horarioHoraFin}/{horarioDia}/{FechaInicio}/{FechaFin}")
	public Horario delete(@PathVariable int horarioHoraInicio, @PathVariable int horarioHoraFin, @PathVariable String horarioDia, @PathVariable String FechaInicio,
			@PathVariable String FechaFin) throws ParseException {
		
		Horario hor = null;
		hor = this.horRepo.delete(horarioHoraInicio, horarioHoraFin, horarioDia, FechaInicio, FechaFin);
		return hor;
	}
	
	@PutMapping("/horarios/{horarioHoraInicio}/{horarioHoraFin}/{horarioDia}/{FechaInicio}/{FechaFin}")
	public Horario update(@RequestBody Horario horario, @PathVariable int horarioHoraInicio, @PathVariable int horarioHoraFin, @PathVariable String horarioDia, @PathVariable String FechaInicio,
			@PathVariable String FechaFin) throws ParseException {
		
		Horario hor = null;
		hor = this.horRepo.upDate(horarioHoraInicio, horarioHoraFin, horarioDia, FechaInicio, FechaFin, horario);
		return hor;
	}
	
}
