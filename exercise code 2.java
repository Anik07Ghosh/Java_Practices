import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0 ;
        do{
            System.out.println("enter a number");
            number = sc.nextInt();
            System.out.print("here is your number");
            System.out.println(number);
        }while(number>=0);
        System.out.println("you dont have enter an integer number");


    }
}