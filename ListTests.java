import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
   public void filterTest() {
       List<String> original = Arrays.asList("testing1","test2","testing3");
       List<String> expected = Arrays.asList("testing1","testing3");
       aChecker sc = new aChecker();
       List<String> result = ListExamples.filter(original, sc);
       assertArrayEquals(expected.toArray(), result.toArray());
   }

   @Test
   public void mergeTest() {
       List<String> first = Arrays.asList("1", "2" , "3");
       List<String> second = Arrays.asList("4");
       String[] arr = new String[]{"1", "2", "3", "4"};
       assertArrayEquals(arr, ListExamples.merge(first, second).toArray());
   }

}

