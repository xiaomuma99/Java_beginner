import org.junit.Test;
import static org.junit.Assert.*;

public class WordUtilsTest {
    public static void main(String[] args) {
        SLList<String> L = new SLList<>();
        L.addLast("Apple");
        L.addLast("Pineapple");
        L.addFirst("I like apple");
        String expect_result = "I like apple";
        String result = WordUtils.Findlongestlist(L);
        System.out.println(result);
        org.junit.Assert.assertEquals(expect_result, result);
        }
}

