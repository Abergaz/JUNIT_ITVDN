import com.itvdn.junit.lesson1.Numbers;

public class Program {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int sum = numbers.sum(5);
        System.out.println("Sum from 0 to 5 = " + sum);
    }
}
