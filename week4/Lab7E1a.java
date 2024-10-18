package week4;

public class Lab7E1a {
    public static void main(String[] args) {
        double balance = 1000;      // initialize to $1000
        double interestRate = 0.1;
        int years = 0;               // number of years
        do {
            balance = ( 1 + interestRate ) * balance;
            years += 1;
        } while ( balance <= 1200 );
        System.out.println( years );
    }
}
