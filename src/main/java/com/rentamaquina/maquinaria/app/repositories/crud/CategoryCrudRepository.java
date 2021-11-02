/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories.crud;

import com.rentamaquina.maquinaria.app.entities.Category;
import com.rentamaquina.maquinaria.app.entities.Category;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nid23
 */
public interface CategoryCrudRepository extends CrudRepository<Category,Integer>{
    public Optional<Category> findById(int categoryId);

    @Override
    public Category save(Category category);

    @Override
    public void delete(Category category);
}
