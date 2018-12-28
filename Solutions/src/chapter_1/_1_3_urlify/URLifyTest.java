package chapter_1._1_3_urlify;

public class URLifyTest {
    public static void main(String[] args) {
        URLify test = new URLify();
        String str = "Alv Me Vale  Verga        ";

        String result = test.urlifyString(str,18);
        System.out.println(result);
    }
}
