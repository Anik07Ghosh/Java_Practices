import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //break & continue
        int i = 0;
        while(true){ //true means, while loop will always be enable
            if(i == 3){
                i=i+1;
                continue; // when value 3 will come, will be skip the value
                
            }
            System.out.println(i);
            i = i+1;

            if(i>5){
                break;
            }

        }
    }
}