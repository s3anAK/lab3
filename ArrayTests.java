import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  
  @Test
  public void testReverseInPlaceFails() {
    int[] input1 = {3,7,9,1,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,1,9,7,3}, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedfails() {
    int[] input1 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = new double[]{1,1,2,4,3,5};
    assertEquals(3, ArrayExamples.averageWithoutLowest(input), 0.01);
  }
}
