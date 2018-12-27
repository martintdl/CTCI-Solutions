package chapter_1._1_1_is_unique;

public class IsUniqueTest {
    public static void main(String[] args) {
        IsUnique test = new IsUnique();
        String str = "abcdefghijklmnopqrstuvwxyz";
        boolean result = test.optimalSolution(str);
        System.out.println(result);
        str = "apuesta";
        result = test.optimalSolution(str);
        System.out.println(result);

        str = "abcdefghijklmnopqrstuvwxyz";
        result = test.bruteForce(str);
        System.out.println(result);
        str = "apuesta";
        result = test.bruteForce(str);
        System.out.println(result);
    }
}
