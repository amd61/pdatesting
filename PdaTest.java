import static org.junit.Assert.*;
import org.junit.*;

public class PdaTest{

  Pda testPda;

  @Before 
  public void before(){
    testPda = new Pda();

  }

  @Test
  public void testFunc1() {
    assertEquals(true, testPda.func1(1));
    assertEquals(false, testPda.func1(2));
  }

  @Test
  public void testMax() {
    assertEquals(5, testPda.max(1,5));
    assertEquals(5, testPda.max(5,1));
  }

  @Test
  public void testLoop() {
    assertEquals("looper passed", testPda.checkLoop());
  }

}