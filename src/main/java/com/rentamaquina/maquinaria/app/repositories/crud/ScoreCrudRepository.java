/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories.crud;

import com.rentamaquina.maquinaria.app.entities.Score;
import com.rentamaquina.maquinaria.app.entities.Score;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nid23
 */
public interface ScoreCrudRepository extends CrudRepository<Score,Integer>{
 public Optional<Score> findById(int scoreId);

    @Override
    public Score save(Score score);

    @Override
    public void delete(Score score);   
}
