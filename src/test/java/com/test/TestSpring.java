package com.test;

import com.implementaciones.DepDisciplina;
import com.implementaciones.Investigador;
import com.implementaciones.Profesor;
import com.interfaces.IConsejoInvestigacion;
import com.interfaces.IInstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/com/configuracion/AplicationContext.xml"})
public class TestSpring {

    private static Log logger = LogFactory.getLog(TestSpring.class);

    @Autowired
    @Qualifier("idProfesor")
    private IInstructor profesorMatematica;

   /* @Autowired
    @Qualifier("idProfesorMatematicaFisica")
    private IInstructor profesorMatematicaFisica;

    @Autowired
    @Qualifier("idInvestigador")
    private IInstructor investigador;
*/
   // @Autowired
   // @Qualifier("depDisciplina")
   // private IConsejoInvestigacion depDisciplina;

//    @Before
//    public void before() {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/configuracion/applicationContext.xml");
//        profesorMatematica = (IInstructor) ctx.getBean("idBeanProfesor");
//        profesorFisica = (IInstructor) ctx.getBean("idBeanProfesorMatematicaFisica");
//        miembroDepInvestigacion = (IInstructor) ctx.getBean("idBeanMiembroDepInvestigacion");
//        miembroDepDisciplina = (IInstructor) ctx.getBean("idBeanMiembroDepDisciplina");
//    }
    @Test
    public void testProfesor() {
        logger.info("Inicio de enseñar matematica");
        int asignaturas = 3;
        profesorMatematica.ejecutar();
        //assertEquals(asignaturas, ((Profesor) profesorMatematica).getNumAsignaturas());
        logger.info("Fin de enseñar");

        // logger.info("Inicio de enseñar matematica y fisica");
        // asignaturas = 3;
        //  profesorMatematicaFisica.ejecutar();
        //  assertEquals(asignaturas, ((Profesor) profesorMatematicaFisica).getNumAsignaturas());
        //   logger.info("Fin de enseñar matematica y fisica");
        // logger.info("Inicio de toma desiciones en el dep Investigacion");
        //  String desicionAdministrativa = "Asignar profesores";
        //  investigador.ejecutar();
        //   assertEquals(desicionAdministrativa, ((Investigador) investigador).getDesicionAdministrativa());
        //  logger.info("Fin de toma desiciones en el dep Investigacion");
        //  logger.info("Inicio de toma desiciones en el dep Disciplina");
        //   String desicionAdministrativa = "Sancionar profesores";
        //  depDisciplina.tomarDesicionesAdministrativas();
        //assertEquals(desicionAdministrativa, ((DepDisciplina) depDisciplina).tomarDesicionesAdministrativas());
        //  logger.info("Fin de toma desiciones en el dep Disciplina");
    }
}
