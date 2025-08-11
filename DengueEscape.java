import java.util.Scanner;

public class DenqueEscape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int health = 100;
        int daySurvived = 0;
        int bites=0;

        boolean gameover =false;

        System.out.println("===Denque Escape Survival===");
        System.out.println("You start with 100 health & 0 daysurvived");

        while (!gameover){
            System.out.println("\nChoose an action");
            System.out.println("1.Stay Indoors");
            System.out.println("2.Go outside for Supplies");
            System.out.println("3.Apply Repellent");
            System.out.println("4.Rest");
            System.out.println("5.Cook & Eat");
            System.out.println("6.Help a Neigbor");
            System.out.println("7.Quit");
            System.out.println("Enter Your choice(1-5)");
            int choice;
            choice=sc.nextInt();

            if(choice==1){
                health-=5;
            }
            else if(choice==2){


            }

        }


    }
}