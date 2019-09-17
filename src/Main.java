import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
	    int lucky_number = (int)(Math.random()*100);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lucky number (0-99): ");
        int my_number = input.nextInt();

        if(lucky_number == my_number){
            System.out.println("You are lucky");
        } else if(lucky_number < my_number){
            System.out.println("Your luck crawled under");
        } else {
            System.out.println("Your luck jumped over you");
        }

        switch(lucky_number){
            case 99:
                System.out.println("The lucky number was at the top");
                break;
            case 0:
                System.out.println("The lucky number was at the bottom");
                break;
            case 49:
                System.out.println("The lucky number was at the middle");
                break;
            default:
                System.out.println("The lucky number was nothing special");
        }
    }
}