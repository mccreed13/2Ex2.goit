import com.goit.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    private SumCalculator sumCalc;
    @BeforeEach
    public void beforeEach(){
        sumCalc = new SumCalculator();
    }

    @Test
    public void testThatSum1WorksCorrect(){
        int expected = 1;

        Assertions.assertEquals(expected, sumCalc.sum(1));
    }

    @Test
    public void testThatSum3WorksCorrect(){
        int expected = 6;

        Assertions.assertEquals(expected, sumCalc.sum(3));
    }

    @Test
    public void testThatSum0WorksCorrect(){
       Assertions.assertThrows(IllegalArgumentException.class, ()-> sumCalc.sum(0)) ;
    }
}
