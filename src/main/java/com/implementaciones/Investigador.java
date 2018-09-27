/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;



import com.exception.EjecucionException;
import com.interfaces.IConsejoInvestigacion;
import com.interfaces.IInstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("idInvestigador")
public class Investigador implements IInstructor{

    @Value("Asignar profesores")
    private String desicionAdministrativa;
    
    @Autowired
    @Qualifier("idDepInvestigacion")
    private IConsejoInvestigacion  iConsejoInvestigacion ;     

    public Investigador() {
    }

    public String getDesicionAdministrativa() {
        return desicionAdministrativa;
    }

    public void setDesicionAdministrativa(String desicionAdministrativa) {
        this.desicionAdministrativa = desicionAdministrativa;
    }
    
    
    
    @Override
    public void ejecutar() throws EjecucionException {
         System.out.println("tomando desicion administrativa: "+desicionAdministrativa+"");
         iConsejoInvestigacion.tomarDesicionesAdministrativas();
    }
    
}
