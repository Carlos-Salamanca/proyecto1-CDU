package co.edu.unicauca.adminCDU.controllers;

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

import co.edu.unicauca.adminCDU.models.Escenario;
import co.edu.unicauca.adminCDU.repositories.EscenarioRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EscenarioRestController {
	
	@Autowired
	private EscenarioRepository escRepo;
	
	
	@GetMapping("/escenarios")
	public List<Escenario> findAll(){
		List<Escenario> lista = null;
		lista = this.escRepo.findAll();
//		System.out.println("***** "+lista);
		return lista;
	}
	
	@GetMapping("/escenarios/{name}")
	public Escenario show(@PathVariable String name) {
		Escenario escenario = null;
		escenario = this.escRepo.findByName(name); 
		return escenario;
	}
	
	@PostMapping("/escenarios")
	public Escenario create(@RequestBody Escenario escenario) {
		Escenario esc = null;
		esc = this.escRepo.save(escenario);
		return esc;
	}
	
	@PutMapping("/escenarios/{name}")
	public Escenario update(@RequestBody Escenario escenario, @PathVariable String name) {
		Escenario esc = null;
		if(this.escRepo.findByName(name) != null) {
			esc = this.escRepo.update(escenario);
		}
		return esc;
	}
	
	@DeleteMapping("/escenarios/{name}")
	public Escenario delete(@PathVariable String name) {
		return this.escRepo.delete(name);
	}
	
}
