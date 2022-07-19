package co.edu.unicauca.adminCDU.services;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unicauca.adminCDU.models.Horario;
import co.edu.unicauca.adminCDU.models.HorarioPK;

public interface IHorarioService extends JpaRepository<Horario, HorarioPK>{

}
