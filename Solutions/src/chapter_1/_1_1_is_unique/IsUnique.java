/*
1.1 Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional
 data structures?
*/

package chapter_1._1_1_is_unique;
public class IsUnique {

    public boolean bruteForce (String string){
        int i, j;
        for (i = 0; i <= string.length(); i++){
            for (j = i+1; j < string.length(); j++){
                if (string.charAt(i) == string.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean optimalSolution (String string){
        boolean[] list = new boolean[128];
        if (string.length() > 128) {
            return false;
        }
        for (int i = 0; i < string.length(); i++){
            if (list[string.charAt(i)])
            {
                return false;
            }
            else {
                list[string.charAt(i)] = true;
            }
        }
        return true;
    }
}
