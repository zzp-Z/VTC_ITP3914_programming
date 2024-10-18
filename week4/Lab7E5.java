package week4;

public class Lab7E5 {
    public static void main(String[] args) {
        int y, x=1, total=0;
        while (x <= 5) {
            y = x * x;
            System.out.println(y);
            total += y;
            x++;
        }
        System.out.println("Total is " + total);

    }
}
