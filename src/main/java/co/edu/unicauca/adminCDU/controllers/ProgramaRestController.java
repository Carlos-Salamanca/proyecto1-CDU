package co.edu.unicauca.adminCDU.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.adminCDU.models.Programa;
import co.edu.unicauca.adminCDU.repositories.ProgramaRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProgramaRestController {
	
	@Autowired
	private ProgramaRepository progRepo;
	
	@GetMapping("/programas")
	public List<Programa> findAll(){
		return progRepo.findAll();
	}
	
	@PostMapping("/programas")
	public Programa create(@RequestBody Programa programa) {
		Programa prog = null;
		prog = progRepo.save(programa);
		return prog;
	}
	
//	@GetMapping("/programas/{id}")
//	public Programa findById(@PathVariable int id) {
//		Programa prog = null;
//		prog = progRepo.findById(id);
//		return prog;
//	}
//	
//	@DeleteMapping("/programas/{id}")
//	public Programa delete(@PathVariable int id) {
//		Programa prog = null;
//		prog = progRepo.delete(id);
//		return prog;
//	}
//	
//	@PutMapping("/programas/{id}")
//	public Programa upDate(@RequestBody Programa programa, @PathVariable int id) {
//		Programa prog = null;
//		prog = progRepo.upDate(id, programa);
//		return prog;
//	}
	
	@GetMapping("/programas/")
	public Programa findById(@RequestParam(name="id") int id) {
		Programa prog = null;
		prog = progRepo.findById(id);
		return prog;
	}
	
	@DeleteMapping("/programas/")
	public Programa delete(@RequestParam(name="id") int idPrograma) {
		Programa prog = null;
		prog = progRepo.delete(idPrograma);
		return prog;
	}
	
	@PutMapping("/programas/")
	public Programa upDate(@RequestBody Programa programa, @RequestParam(name="id") int idPrograma) {
		Programa prog = null;
		prog = progRepo.upDate(idPrograma, programa);
		return prog;
	}
}
