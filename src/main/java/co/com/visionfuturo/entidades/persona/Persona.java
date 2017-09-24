/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.visionfuturo.entidades.persona;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author HP-15-AX2005la
 */
@Entity
@Table(name = "personas")
@NamedQueries({
    @NamedQuery(name=PersonaUtil.BUSCAR_TODAS, query="SELECT p FROM Persona p")
}) 
public class Persona implements Serializable {

    @Id
    @Column(name = "identificacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificacion;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + '}';
    }
}
