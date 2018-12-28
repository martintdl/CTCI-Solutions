package chapter_1._1_2_check_permutation;

public class CheckPermutationTest {
    public static void main(String[] args) {
        CheckPermutation object = new CheckPermutation();
        boolean result;
        String str = "abcdefg";
        String base = "abcdefh";
        result = object.bruteForce(str,base);

        System.out.println(result);

        result = object.optimalSolution(str, base);
        System.out.println(result);
    }
}
