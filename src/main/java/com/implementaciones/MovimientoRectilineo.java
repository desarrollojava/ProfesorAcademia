/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.exception.EjecucionException;
import com.interfaces.IFisica;
import org.springframework.stereotype.Component;

@Component("idMovimientoRectilineo")
public class MovimientoRectilineo implements IFisica {

    @Override
    public void enseniarFisicaPractica() throws EjecucionException {
        String experimentoPractico = "se realiza un experimento practico de fisica";
        System.out.println("experimento practico: " + experimentoPractico + "");
    }

}
