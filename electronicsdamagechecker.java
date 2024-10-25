import java.util.Scanner;

public class electronicsdamagechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt User For Input
        System.out.print("Is there any physical damage to the device? (yes/no): ");
        String physicalDamage = scanner.next().toLowerCase();

        System.out.print("Does the device power on? (yes/no): ");
        String powersOn = scanner.next().toLowerCase();

        System.out.print("Does the device function correctly? (yes/no): ");
        String functionsCorrectly = scanner.next().toLowerCase();

        // Check Conditions To Determine Whether The Electronic Appliance Is Damaged
        boolean isDamaged = false;

        if (physicalDamage.equals("yes")) {
            isDamaged = true;
        } else if (powersOn.equals("no")) {
            isDamaged = true;
        } else if (functionsCorrectly.equals("no")) {
            isDamaged = true;
        }

        // Output Result
        if (isDamaged) {
            System.out.println("The electronic device is damaged.");
        } else {
            System.out.println("The electronic device is functioning properly.");
        }

        // Close The Scanner
        scanner.close();
    }
}
