import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceB = 500;
        int distanceC = 700;
        int distanceD = 900;

        System.out.print("Yolcunun yaşını girin: ");
        int age = scanner.nextInt();

        System.out.print("Gidiş-dönüş bileti alınacak mı? (E/H): ");
        String roundTripInput = scanner.next();
        boolean isRoundTrip = roundTripInput.equalsIgnoreCase("E");

        double totalPrice = 0;

        if (isRoundTrip) {
            totalPrice += calculateTicketPrice(distanceB, age, isRoundTrip);
            totalPrice += calculateTicketPrice(distanceC, age, isRoundTrip);
            totalPrice += calculateTicketPrice(distanceD, age, isRoundTrip);
            totalPrice *= 0.8;
        } else {
            totalPrice = calculateTicketPrice(distanceB, age, isRoundTrip) +
                    calculateTicketPrice(distanceC, age, isRoundTrip) +
                    calculateTicketPrice(distanceD, age, isRoundTrip);
        }

        System.out.println("Toplam bilet fiyatı: $" + totalPrice);
    }

    private static double calculateTicketPrice(int distance, int age, boolean isRoundTrip) {
        double basePrice = distance * 0.10;

        if (age < 12) {
            basePrice *= 0.5;
        } else if (age >= 12 && age <= 24) {
            basePrice *= 0.9;
        } else if (age >= 65) {
            basePrice *= 0.7;
        }

        if (isRoundTrip) {
            basePrice *= 0.8;
        }

        return basePrice;
    }
}
