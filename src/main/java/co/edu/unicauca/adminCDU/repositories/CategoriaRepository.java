package co.edu.unicauca.adminCDU.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.adminCDU.models.Categoria;
import co.edu.unicauca.adminCDU.services.ICategoriaService;

@Service
public class CategoriaRepository {
	
	@Autowired
	private ICategoriaService cat;
	
	public Categoria save(Categoria categoria) {
		System.out.println("Invocando a guardar categoria");
		cat.save(categoria);
		return categoria;
	}
	
	public List<Categoria> findAll() {
		System.out.println("Invocando a listar categorias");
		return cat.findAll();
	}
	
	public Categoria findByName(String name) {
		System.out.println("Invocando a buscar categorias por id");
		Categoria categoria = cat.findById(name).orElse(null);
		return categoria;
	}
	
	public Categoria update(String name, Categoria categoria) {
		System.out.println("Invocando a editar una categoria por id");
		Categoria cateSave = findByName(name);	
		if(cateSave != null){
			cateSave = cat.save(categoria);
		}
		return cateSave;
	}
	
	public Categoria delete(String name) {
		System.out.println("Invocando a eliminar categorias por id");
		Categoria cateSave = findByName(name);	
		if(cateSave != null){
			cat.deleteById(name);
		}
		return cateSave;
	}
	
}
