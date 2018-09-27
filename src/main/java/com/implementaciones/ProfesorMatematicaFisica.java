/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.implementaciones.Profesor;
import com.interfaces.IFisica;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("idProfesorMatematicaFisica")
public class ProfesorMatematicaFisica extends Profesor {

    private IFisica iFisica;

    public ProfesorMatematicaFisica() {
    }

    public ProfesorMatematicaFisica(IFisica iFisica) {
        super();
        this.iFisica = iFisica;
    }

    public ProfesorMatematicaFisica(@Value("3") int numeroAsignaturas, IFisica iFisica) {
        super(numeroAsignaturas);
        System.out.println("y tambien enseña fisica practica de movimiento rectilineo");
        iFisica.enseniarFisicaPractica();
    }

}
