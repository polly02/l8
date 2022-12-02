import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomMathTest {

    // подключение к базе данных, или подготовку данных для обработки
    @BeforeClass
    public static void setUpClass() throws Exception {

    }
    // отключение от базы данных, восстановление исходного ее состояния
    @AfterClass
    public static void tearDownClass() throws Exception {

    }

    @Test
    public void testSum() {
        System.out.println("sum");
        int x = 4;
        int y = 2;
        int expResult = 6;
        int result = CustomMath.sum(x,y);
        assertEquals(expResult, result);
       //fail("The test case is a prototype");
    }
    @Test
    public void testDivision() {
        System.out.println("division");
        int x = 5;
        int y = 1;
        int expResult = 5;
        int result = CustomMath.division(x,y);
        assertEquals(expResult, result);
        //fail("The test case is a prototype");
    }

    @Test
    public void testMain(){
        System.out.println("main");
        String[] args = null;
        CustomMath.main(args);
        //fail("The test case is a prototype");
    }

    @Test
    public void testDivisionByZero() {
        int x = 5;
        int y = 0;
        int expResult = 5;
        
        try {
            int result = CustomMath.division(x,y);
            assertEquals(expResult,result);
            if(y==0) {}//fail("Division to zero is not creating an exception");
        } catch (IllegalArgumentException e) {
            if(y!=0) {}//fail("Exeption with zero element");
        }
    }
}

