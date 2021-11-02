/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories.crud;

import com.rentamaquina.maquinaria.app.entities.Client;
import com.rentamaquina.maquinaria.app.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nid23
 */
public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer>{

    public Reservation save(Reservation reservation);

    public void delete(Reservation reservation);
    
}
