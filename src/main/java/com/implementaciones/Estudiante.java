package com.implementaciones;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Estudiante {

    public void sentarse() {
        System.out.println("las clases estan por comenzar, por favor tomar asiento");
    }

    public void apagarCelulares() {
        System.out.println("Por favor apagar los celulares");
    }

    public void realizarPreguntas() {
        System.out.println("las clases han finalizado, realizar preguntas");
    }

    public void salirDelAula() {
        System.out.println("las clases se han concluido, salir del aula");
    }

    public void monitorearClasesMatematica(ProceedingJoinPoint joinjPoint) {
        try {
            System.out.println("las clases estan por comenzar, por favor tomar asiento");
            System.out.println("Por favor apagar los celulares");
            long horaInicio = System.currentTimeMillis();//hora de inicio
            //se llama almetodo de negocio (metodo objetivo)
            joinjPoint.proceed();
            Thread.sleep(1000);
            //1 segundo
            //Este delay enmilisegundos  es opcional y se puede poner en los metodos de negocio para simular la duracion delmetodo
            System.out.println("las clases han finalizado, por favor realizar preguntas");
            long horaTermino = System.currentTimeMillis();
            System.out.println("las clases duraron:" + (horaTermino - horaInicio));

        } catch (Throwable t) {
            System.out.println("Los alumnos han finalizado las clases.");
        }
    }

}
