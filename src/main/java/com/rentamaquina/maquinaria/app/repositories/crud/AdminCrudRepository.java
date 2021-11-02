/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories.crud;

import com.rentamaquina.maquinaria.app.entities.Admin;
import com.rentamaquina.maquinaria.app.entities.Admin;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nid23
 */
public interface AdminCrudRepository extends CrudRepository<Admin,Integer>{
     public Optional<Admin> findById(int adminId);

    public Admin save(Admin admin);

    public void delete(Admin admin);
}
