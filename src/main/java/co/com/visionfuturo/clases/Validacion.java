/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author UBERNEY
 */
public class Validacion {
     public void soloTexto (char letra, java.awt.event.KeyEvent evt){
        char tecla = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z')&&(letra <'A' || letra > 'Z')){
        JOptionPane.showMessageDialog(null, "Solo se permiten letras");
        evt.consume();
    }
    }
    
    public void soloNumeros (char num,java.awt.event.KeyEvent evt ){
        char tecla = evt.getKeyChar();
        if ((num < '0' || num > '9')){
        JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
        evt.consume();
    }
    }
    
}
