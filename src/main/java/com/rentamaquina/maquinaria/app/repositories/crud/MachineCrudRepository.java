/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories.crud;

import com.rentamaquina.maquinaria.app.entities.Machine;
import com.rentamaquina.maquinaria.app.entities.Machine;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nid23
 */
public interface MachineCrudRepository extends CrudRepository<Machine,Integer>{
    public Optional<Machine> findById(int machineId);

    @Override
    public Machine save(Machine machine);

    @Override
    public void delete(Machine machine);
    
}


