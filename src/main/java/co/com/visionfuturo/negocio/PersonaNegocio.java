/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.visionfuturo.negocio;

import co.com.visionfuturo.bean.PersonaBean;
import java.util.List;
import co.com.visionfuturo.entidades.persona.Persona;
/**
 *
 * @author HP-15-AX2005la
 */
public class PersonaNegocio {
    
    public List<Persona> obtenerPersonas() {
        PersonaBean personaBean = new PersonaBean();
        
        return personaBean.buscarTodas();
    }
    
}
