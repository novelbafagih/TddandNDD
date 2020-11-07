import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatorTest {

    @Test
    public void givenCalculatorWhenGivenCancelReturn0(){
        Calculator calculator= new Calculator();
        calculator.cancel();

        String expect = calculator.toString();
        assertEquals("0.0",expect);
    }

    @Test
    public void givencalCalculatorWhenGivenAddNumber(){
        Calculator calculator= new Calculator();
        calculator.result=0.0;
        double test=1.0;

        calculator.add(test);
        String expect = calculator.toString();
        assertEquals("1.0",expect);
    }

    @Test
    public void givencalCalculatorWhenGivenSubtractNumber(){
        Calculator calculator= new Calculator();
        calculator.result=0.0;
        double test=1.0;

        calculator.subtract(test);
        String expect = calculator.toString();
        assertEquals("-1.0",expect);
    }
}
