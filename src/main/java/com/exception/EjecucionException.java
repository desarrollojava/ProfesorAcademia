/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exception;


/**
 * 
 *
 * @author Lorena
 */
public class EjecucionException extends RuntimeException {

    public EjecucionException() {
    }

    public EjecucionException(String sms) {
        super(sms);
    }

}
