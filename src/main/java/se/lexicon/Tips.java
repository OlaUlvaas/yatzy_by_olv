package se.lexicon;

import java.util.Arrays;
import java.util.Random;

public class Tips {
    public static void main(String[] args) {
        Random random = new Random();

        all_13(random);


    }

    private static void all_13(Random random) {
        String[] ark = new String[13];
        for(int i = 0; i < ark.length; i++){
            ark[i] = tips_1X2(random);
        }
        System.out.println(Arrays.toString(ark));
    }

    private static String tips_1X2(Random random) {
        double randRes = random.nextDouble();
        String result;
        if(randRes < 0.55){
            result = "1";
        }
        else if(randRes < 0.7){
            result = "X";
        }
        else{
            result = "2";
        }
        //System.out.println(result);
        return result;
    }
}
