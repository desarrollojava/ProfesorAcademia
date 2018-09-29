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
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/com/configuracion/Datasource-test.xml"})
public class TestSpringJdbc {

    private static Log logger = LogFactory.getLog(TestSpringJdbc.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testJdbc() {
        long numeroPersonas=jdbcTemplate.queryForObject("select count(*) from persona",Long.class);
        logger.info(numeroPersonas);
    }
}
