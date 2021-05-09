package se.lexicon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        Scanner scanner;
        Random random = new Random();
        try {
            scanner = new Scanner(new File("name.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Something wrong with the file");
            return;
        }

        User[] users = new User[10];
        int i = 0;
        while(scanner.hasNext()){
            int cardNr = scanner.nextInt();
            String firstName = scanner.next();
            String lastName = scanner.next();
            int phone = scanner.nextInt();
            User u = new User(cardNr, firstName, lastName, phone);
            users[i] = u;
            i++;
            System.out.println("Nr " + i + ": " + u);


        }



























































       /* Scanner scanner;
        try {
            scanner = new Scanner(new File("name.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("problem with the file");
            return;
        }
        User[] users = new User[5];
        int i = 0;
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            String firstName = scanner.next();
            String lastName = scanner.next();
            int phone = scanner.nextInt();
            User u = new User(num, firstName, lastName, phone);
            users[i] = u;
            i++;

            System.out.println(u);
            //System.out.println(num + " " + firstName + " " + lastName);
        }
        System.out.println(Arrays.toString(users));
        System.out.println(users[1].getLastName());
        System.out.println(users[3].getCardNum());
        System.out.println(users[4].getFirstName());
        System.out.println(users[2].getPhone());

*/
    }
}
