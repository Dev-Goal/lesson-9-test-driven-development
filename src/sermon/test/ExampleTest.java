package sermon.test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void testNotSameObject() {
        String str1 = new String("JUnit");
        String str2 = str1;  // str1 và str2 trỏ đến các đối tượng khác nhau mặc dù có nội dung giống nhau
        assertNotSame(str1, str2, "str1 và str2 không nên trỏ đến cùng một đối tượng");
    }
}

