import Service.CalculatorService;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {

    @Test
    public void AdditionTest1(){
        CalculatorService service = new CalculatorService();
        double a = 5;
        double b = 10;
        double expected = 15;
        double actual = service.add(a, b);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void SubtractionTest1(){
        CalculatorService service = new CalculatorService();
        double a = 5;
        double b = 10;
        double expected = 5;
        double actual = service.subtract(b, a);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void MultiplicationTest1(){
        CalculatorService service = new CalculatorService();
        double a = 5;
        double b = 10;
        double expected = 50;
        double actual = service.multiply(a, b);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void DivisionTest1(){
        CalculatorService service = new CalculatorService();
        double a = 5;
        double b = 10;
        double expected = 2;
        double actual = service.divide(b, a);
        Assert.assertEquals(expected, actual, 0.0);
    }

}
