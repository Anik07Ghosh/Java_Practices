import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // writng a code that , can a person buy $10 pen and $40 notbook at a time ??
        //or get atleast one thing at a time
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        if(cash<10){
            System.out.println("can't buy anything");

        } else if (cash>10 && cash<50) {
            System.out.println("can buy on thing at a time");

        }
        else {
            System.out.println("can get both");
        }


    }
}