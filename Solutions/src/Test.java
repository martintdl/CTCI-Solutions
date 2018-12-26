import chapter_1._1_1_is_unique.IsUnique;

public class Test {
    public static void main(String[] args) {
        IsUnique test = new IsUnique();
        String str = "ferrocarril";
        boolean result = test.checkString(str);
        System.out.println(result);
    }
}
