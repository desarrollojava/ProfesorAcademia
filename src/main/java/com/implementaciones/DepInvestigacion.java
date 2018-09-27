/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.exception.EjecucionException;
import com.interfaces.IConsejoInvestigacion;
import org.springframework.stereotype.Component;

@Component("idDepInvestigacion")
public class DepInvestigacion implements IConsejoInvestigacion {

    @Override
    public void tomarDesicionesAdministrativas() throws EjecucionException {
         System.out.println("Asignar profesores para investigar");
    }
    
}
