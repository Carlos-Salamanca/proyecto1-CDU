package co.edu.unicauca.adminCDU.services;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unicauca.adminCDU.models.Programa;

public interface IProgramaService extends JpaRepository<Programa, Integer>{

}
