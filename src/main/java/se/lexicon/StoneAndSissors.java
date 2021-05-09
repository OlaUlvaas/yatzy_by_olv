package se.lexicon;

import java.util.ArrayList;
import java.util.Random;

public class StoneAndSissors {
    public static void main(String[] args) {
        ArrayList<String> things = new ArrayList<String>();
        things.add("sten");
        things.add("sax");
        things.add("påse");

        ArrayList<String> fishes = new ArrayList<String>();
        fishes.add("abborre");
        fishes.add("torsk");
        fishes.add("lax");

        ArrayList<String> tips = new ArrayList<String>();
        tips.add("1");
        tips.add("X");
        tips.add("2");

        Random random = new Random();
        int a = random.nextInt(things.size());
        int b = random.nextInt(fishes.size());
        int c = random.nextInt(tips.size());


        System.out.println(things.get(a));
        System.out.println(fishes.get(b));
        System.out.println(tips.get(c));

    }
}
