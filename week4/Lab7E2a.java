package week4;

public class Lab7E2a {
    public static void main(String[] args) {
        int c=0, product=1;
        while (c <= 5) {
            product *= c;
            ++c;
        }
        System.out.println(product);
    }
}
