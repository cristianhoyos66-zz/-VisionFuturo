/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.visionfuturo.bean;

import java.util.List;
import javax.persistence.EntityManager;
import co.com.visionfuturo.entidades.persona.Persona;
import co.com.visionfuturo.entidades.persona.PersonaUtil;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author HP-15-AX2005la
 */
public class PersonaBean {
    
    private EntityManagerFactory entityManagerFactory;
    
    public PersonaBean() {
        entityManagerFactory = Persistence.createEntityManagerFactory("visionfuturo_pu");
    }
    
    public List<Persona> buscarTodas() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.createNamedQuery(PersonaUtil.BUSCAR_TODAS, Persona.class).getResultList();
    }
    
}
