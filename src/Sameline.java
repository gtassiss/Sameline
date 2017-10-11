import java.util.Scanner;
public class Sameline {
    public static void main(String[] args) {
        System.out.println("Enter #");
        Scanner keyboard = new Scanner(System.in);
       int counter = 0;
        int Sum = 0;
        int i = keyboard.nextInt();
        while (counter <= i){
        Sum = Sum + counter;
        counter++;
        System.out.println ("["+counter+"]");
    }


    }
}
