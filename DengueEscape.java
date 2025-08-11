import java.util.Scanner;

public class DenqueEscape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int health = 100;
        int daySurvived = 0;
        int bites = 0;

        boolean gameover = false;

        System.out.println("=== Denque Escape Survival ===");
        System.out.println("You start with 100 health & 0 days survived.");

        while (!gameover) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Stay Indoors (-5 health, safe from bites)");
            System.out.println("2. Go Outside for Supplies (-15 health, +1 bite)");
            System.out.println("3. Apply Repellent (-5 coins, avoid bites next day)");
            System.out.println("4. Rest (+10 health)");
            System.out.println("5. Cook & Eat (+15 health)");
            System.out.println("6. Help a Neighbor (-10 health, +1 bite)");
            System.out.println("7. Quit");
            System.out.print("Enter your choice (1-7): ");

            int choice = sc.nextInt();
            daySurvived++;

            switch (choice) {
                case 1:
                    health -= 5;
                    System.out.println("You stayed indoors. Minor health loss from inactivity.");
                    break;
                case 2:
                    health -= 15;
                    bites++;
                    System.out.println("You went outside and got bitten! Supplies gathered.");
                    break;
                case 3:
                    System.out.println("You applied repellent. No bites today.");
                    break;
                case 4:
                    health += 10;
                    System.out.println("You rested well and regained health.");
                    break;
                case 5:
                    health += 15;
                    System.out.println("You cooked and ate a healthy meal.");
                    break;
                case 6:
                    health -= 10;
                    bites++;
                    System.out.println("You helped your neighbor but got bitten.");
                    break;
                case 7:
                    System.out.println("You chose to quit the game.");
                    gameover = true;
                    continue;
                default:
                    System.out.println("Invalid choice. Try again.");
                    daySurvived--;
                    continue;
            }

            if (bites >= 3) {
                System.out.println("Too many mosquito bites! You got infected and the game ends.");
                gameover = true;
            }

            if (health <= 0) {
                System.out.println("Your health dropped to zero. You didn't survive.");
                gameover = true;
            }

            if (!gameover) {
                System.out.println("Day survived: " + daySurvived);
                System.out.println("Health: " + health);
                System.out.println("Bites: " + bites);
            }
        }

        System.out.println("\nGame Over! You survived " + daySurvived + " days with " + bites + " bites.");
        sc.close();
    }
}
