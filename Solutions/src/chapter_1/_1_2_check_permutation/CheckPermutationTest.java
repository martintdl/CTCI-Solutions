package chapter_1._1_2_check_permutation;

public class CheckPermutationTest {
    public static void main(String[] args) {
        CheckPermutation object = new CheckPermutation();
        boolean result;
        String subj = "quepedo";
        String base = "pedoque";
        result = object.bruteForce(subj,base);

        System.out.println(result);
    }
}
