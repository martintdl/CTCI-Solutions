/*
1.2 Given two strings, write a method to decide if one is a permutation of the other.
 */
package chapter_1._1_2_check_permutation;
import java.util.Arrays;

public class CheckPermutation {

    public boolean bruteForce(String str, String base){
        if (str.length() != base.length()){
            return false;
        }
        char[] tempstr = str.toCharArray();
        char[] tempbase = base.toCharArray();
        Arrays.sort(tempstr);
        Arrays.sort(tempbase);
        return Arrays.equals(tempstr, tempbase);
    }

    public boolean optimalSolution(String str, String base){
        if (str.length() != base.length()){
            return false;
        }
        int[] temp = new int[128]; //Assumption for ASCII
        char[] tempstr = str.toCharArray();
        char[] tempbase = base.toCharArray();
        for (char c : tempstr){
            temp[c]++;
        }
        for (char d : tempbase){
            temp[d]--;
            if (temp[d] < 0){
                return false;
            }
        }
        return true;
    }
}
