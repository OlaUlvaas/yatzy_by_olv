package se.lexicon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Yatzy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] throwDices = new int[5];


        newThrow(random, throwDices);

        showTheDices(throwDices);

        saveOrNot(scanner, throwDices);

        throwAgain(random, throwDices);

        saveOrNot(scanner, throwDices);

        throwAgain(random, throwDices);


    }

    private static void throwAgain(Random random, int[] throwDices) {
        for(int i = 0; i < throwDices.length; i++){
            if(throwDices[i] == 0){
                throwDices[i] = random.nextInt(6) +  1;
            }
        }
        System.out.println(Arrays.toString(throwDices));
    }

    private static void saveOrNot(Scanner scanner, int[] throwDices) {
        int i = 0;
        while(i < 5){
            System.out.println("Do you want to save Dice #" + (i + 1) + " ? (Y/N): " );
            String answer = scanner.next();
            if(answer.startsWith("Y")||answer.startsWith("y")){
                //thirdThrow[i] = secondThrow[i];
                i++;
            }
            else if(answer.startsWith("N")||answer.startsWith("n")){
                throwDices[i] = 0;
                i++;
            }
            else{
                System.out.println("Wrong input!");
            }

        }
        System.out.println(Arrays.toString(throwDices));
    }

    private static void showTheDices(int[] throwDices) {
        for(int i = 0; i < throwDices.length; i++){
            System.out.println("Dice " + (i +1) +" shows: " + throwDices[i]);
        }
    }

    private static void newThrow(Random random, int[] throwDices) {
        for(int i = 0; i < throwDices.length; i++){
            throwDices[i] = random.nextInt(6) +  1;
        }

        System.out.println(Arrays.toString(throwDices));
    }
}
