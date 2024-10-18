package week2;

public class PrintStar1 {
    public static void main(String[] args) {
        String star = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(star);
            star = star + "*";
        }
    }
}
