package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6E7 {
    public static void main(String[] args) {

        // Step 1: Define fee rates
        Map<Integer, Integer> feeRates = new HashMap<>();
        feeRates.put(1, 15); // Private Car - $15
        feeRates.put(2, 35); // Bus - $35
        feeRates.put(3, 50); // Truck - $50

        // Step 2: Input data
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vehicle Type [1=private, 2=bus, 3=truck]?");
        int vehicleType = scanner.nextInt();
        System.out.print("Number of hours?");
        int hoursParked = scanner.nextInt();

        // Step 3: Validate input data
        // TODO: Validate input data

        // Step 4: Calculate fee
        int fee = feeRates.get(vehicleType) * hoursParked;
        System.out.println("Parking fee = " + fee);

    }
}
