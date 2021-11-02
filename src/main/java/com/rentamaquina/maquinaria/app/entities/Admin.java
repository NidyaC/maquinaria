/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rentamaquina.maquinaria.app.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
/**
 *
 * @author nid23
 */
public class Admin implements Serializable {
            @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idAdmin;
	    private String email;
	    private String password;
	    private String name;
}
