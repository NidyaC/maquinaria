/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories.crud;

import com.rentamaquina.maquinaria.app.entities.Client;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nid23
 */
public interface ClientCrudRepository extends CrudRepository<Client,Integer>{

    public Optional<Client> findById(int clientId);

    @Override
    public Client save(Client client);

    @Override
    public void delete(Client client);
    
}
