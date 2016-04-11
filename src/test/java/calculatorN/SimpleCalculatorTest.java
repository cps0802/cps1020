package calculatorN;
import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

   @Test
   public void testadd() {
      SimpleCalculator chap = new SimpleCalculator();
      chap.add(10, 20);
      assertEquals(30,chap.getResult());
      
      
   }

}