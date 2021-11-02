/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories.crud;

import com.rentamaquina.maquinaria.app.entities.Message;
import com.rentamaquina.maquinaria.app.entities.Message;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nid23
 */
public interface MessageCrudRepository extends CrudRepository<Message,Integer>{
 public Optional<Message> findById(int messageId);

    @Override
    public Message save(Message message);

    @Override
    public void delete(Message message);
    
}
