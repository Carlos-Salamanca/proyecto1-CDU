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

import co.edu.unicauca.adminCDU.models.Categoria;
import co.edu.unicauca.adminCDU.repositories.CategoriaRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CategoriaRestController {
	
	@Autowired
	private CategoriaRepository catRepo;
	
	
//	@GetMapping("/categorias")
//	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//		
//		
////		cat.save(catRepo.save());	
//		
//		Categoria categoria = new Categoria();
//		categoria.setCatNombre("Diamante");
//		categoria.setCatFoto("imagen.png");
//		categoria.setCatDescripcion("Centro deportivo ubicado en el sector pomona");
//		catRepo.save(categoria);
//		
//		
//		model.addAttribute("name", name);
//		return "categorias";
//	}
//	
//	
//	@GetMapping("/categorias/listar")
//	public String greeting(Model model) {	
//		
//		model.addAttribute("categorias", catRepo.findAll());
//		return "listar";
//	}
	
	@GetMapping("/categorias")
	public List<Categoria> findAll(){
		List<Categoria> lista = null;
		lista = this.catRepo.findAll();
		return lista;
	}
	
	@PostMapping("/categorias")
	public Categoria create(@RequestBody Categoria categoria) {
		Categoria cat = null;
		cat = this.catRepo.save(categoria);
		return cat;
	}
	
	@PutMapping("/categorias/{name}")
	public Categoria update(@RequestBody Categoria categoria, @PathVariable String name) {
		Categoria cat = null;
		cat = this.catRepo.update(name, categoria);
		return cat;
	}
	
	@DeleteMapping("/categorias/{name}")
	public Categoria delete(@PathVariable String name) {
		Categoria cat = this.catRepo.delete(name);
		return cat;
	}
	
	@GetMapping("/categorias/{name}")
	public Categoria findByCategoria(@PathVariable String name) {
		Categoria cat = this.catRepo.findByName(name);
		return cat;
	}
	
}
