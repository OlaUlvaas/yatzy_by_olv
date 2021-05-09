package se.lexicon;

import java.util.Random;

public enum Females {
    ANNA, ALICIA, BEATRICE, CECILIA, OLGA, PETRA, URSULA, PERNILLA, SANNA, ULRIKA, SOFIA,
    CARINA, CHARLOTTE, FRIDA, EBBA, JESSICA, MARIA, ISABELLE, NELLIE, MI, ANNIKA, PIA,
    HANNA, EMMA, MARIE, HILDA, CHRISTINA, IRIS, BODIL, LINDA;

    public static Females randFemaleName(){
        Females[] femaleNames = Females.values();
        Random random = new Random();
        return femaleNames[random.nextInt(femaleNames.length)];
    }
}
