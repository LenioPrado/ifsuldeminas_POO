package ListaUnicamp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {
    
    static Logger logger = Logger.getLogger(Tests.class.getName());
    private Questao2 questao2;

    @Before
    public void init() {
        //logger.info("startup - before");
    }

    @After
    public void teardown() {
        //logger.info("teardown - after");
    }

    @BeforeClass
    public static void setup() {
        logger.info("startup - before class");
    }

    @AfterClass
    public static void tearDown() {
        logger.info("teardown - after class");
    }
    
    @Test
    public void diaInvalido(){
        String data = "32/03/2022";
        questao2 = new Questao2(data);

        assertEquals(questao2.getDia(), 1);
        assertEquals(questao2.getMes(), 1);
        assertEquals(questao2.getAno(), 1);
    }

    @Test
    public void mesInvalido(){
        String data = "02/13/2022";
        questao2 = new Questao2(data);

        assertEquals(questao2.getDia(), 1);
        assertEquals(questao2.getMes(), 1);
        assertEquals(questao2.getAno(), 1);
    }

    @Test
    public void anoInvalido(){
        String data = "02/12/10000";
        questao2 = new Questao2(data);

        assertEquals(questao2.getDia(), 1);
        assertEquals(questao2.getMes(), 1);
        assertEquals(questao2.getAno(), 1);
    }

    @Test
    public void caracterInvalido(){
        String data = "0,2/10/2000";
        questao2 = new Questao2(data);

        assertEquals(questao2.getDia(), 1);
        assertEquals(questao2.getMes(), 1);
        assertEquals(questao2.getAno(), 1);
    }

    @Test
    public void diaMes30Invalido(){
        String data = "31/04/2000";
        questao2 = new Questao2(data);

        assertEquals(questao2.getDia(), 1);
        assertEquals(questao2.getMes(), 1);
        assertEquals(questao2.getAno(), 1);
    }

    @Test
    public void diaMes31Invalido(){
        String data = "32/05/2000";
        questao2 = new Questao2(data);

        assertEquals(questao2.getDia(), 1);
        assertEquals(questao2.getMes(), 1);
        assertEquals(questao2.getAno(), 1);
    }

    @Test
    public void anoBissexto(){
        String[] data = { "29/02/1700", "29/02/1600", "29/02/2000", "29/02/1800", "29/02/1900", "29/02/2100", "29/02/1980", "29/02/1984", "29/02/1988", "29/02/1200" };
        int[] dias = { 1, 29, 29, 1, 1, 1, 1 ,1, 1, 29};
        int[] meses = { 1, 2, 2, 1, 1, 1, 1, 1, 1, 2};
        int[] anos = { 1, 1600, 2000, 1, 1, 1, 1, 1, 1, 1200 };

        for (int cont = 0; cont < data.length; cont++) {
            logger.info("Contagem: " + (cont + 1) + " Data: " + data[cont]);
            questao2 = new Questao2(data[cont]);

            assertEquals(questao2.getDia(), dias[cont]);
            assertEquals(questao2.getMes(), meses[cont]);
            assertEquals(questao2.getAno(), anos[cont]);
        }        
    }

    @Test
    public void comparaData(){
        String data = "10/01/2023";
        questao2 = new Questao2(data);

        String[] dataComparar = { "05/01/2023", "10/01/2023", "12/01/2023" };
        int[] resultadoComparar = { 1, 0, -1};

        for (int cont = 0; cont < dataComparar.length; cont++) {
            logger.info("Contagem: " + (cont + 1) + " Data: " + dataComparar[cont]);

            Questao2 questaoComparar = new Questao2(dataComparar[cont]);
            assertEquals(questao2.compara(questaoComparar), resultadoComparar[cont]);
        }   
    }

    @Test
    public void clonar(){
        String data = "10/01/2023";
        questao2 = new Questao2(data);
        Questao2 questao2Clonada = questao2.clonar();
        assertNotEquals(questao2, questao2Clonada);
        assertEquals(questao2.getDia(), questao2Clonada.getDia());
        assertEquals(questao2.getMes(), questao2Clonada.getMes());
        assertEquals(questao2.getAno(), questao2Clonada.getAno());
        assertEquals(questao2.compara(questao2Clonada), 0);
    }
}
