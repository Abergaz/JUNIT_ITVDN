import com.itvdn.junit.lesson1.Numbers;

import static org.junit.Assert.*;

public class ProgramTest {

    @org.junit.Test
    public void main() {
        Numbers numbers=new Numbers();
        int actual = numbers.sum(5);
        int expected =15;
        assertEquals(expected,actual);
    }
}