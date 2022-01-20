import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator cal=new Calculator();

  @Test
  public void add1Test() {
	  Assert.assertEquals(cal.add1(5,5),10);
 
  }

  @Test
  public void subTest() {
Assert.assertEquals(cal.sub(5, 4),1);
  
  }
}
