/*
1.2 Given two strings, write a method to decide if one is a permutation of the other.
 */
package chapter_1._1_2_check_permutation;
import java.util.Arrays;

public class CheckPermutation {

    public boolean bruteForce(String subj, String base){
        if (subj.length() != base.length()){
            return false;
        }
        char[] tempsubj = subj.toCharArray();
        char[] tempbase = base.toCharArray();
        Arrays.sort(tempsubj);
        Arrays.sort(tempbase);
        return Arrays.equals(tempsubj, tempbase);
    }
}
