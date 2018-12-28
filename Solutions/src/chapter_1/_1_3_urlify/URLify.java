/*
1.3 Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at
the end to hold the additional characters, and that you are given the "true" length  of the string.
EXAMPLE
Input: "Mr John Smith    ", 13
Output "Mr%20John#20Smith"
 */
package chapter_1._1_3_urlify;

public class URLify {
    public String urlifyString(String str, int l){
        char[] phrase = str.toCharArray();
        int n = 0;
        int[] pos = new int[l];
        for (int i = 0; i < l ; i++){ //Count # of spaces (n) and their position
            if (phrase[i] == ' '){
                pos[n] = i;
                n++;
            }
        }
        if (n == 0){ //If there are no spaces return the string as is
            return str;
        }
        int countdown = n;
        for (int j = l-1; j > pos[0]; j--){ //Move characters (from last to first) according to how many spaces there are
            phrase[j+(countdown*2)] = phrase[j];
            if (phrase[j] == ' '){
                countdown--;
            }
        }
        for (int k = 0; k < n; k++){ //Insert '%20' on each space
            phrase[pos[k]+k*2] = '%';
            phrase[pos[k]+k*2+1] = '2';
            phrase[pos[k]+k*2+2] = '0';
        }
        return new String(phrase);
    }
}
