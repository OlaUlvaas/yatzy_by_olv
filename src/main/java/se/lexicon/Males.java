package se.lexicon;

import java.util.Random;

public enum Males {
    ANDERS, BENNY, FREDRIK, JIMMIE, PETER, CHRISTIAN, CONNY, MATTIAS, MATS, PER, GUSTAV,
    THOMAS, ELIAS, HENRY, LARS, BERT, RUDOLF, STEFAN, TOMMY, MIKAEL, DENNIS, INGE,
    MAGNUS, OLOF, ERIK, JENS, OLA, JOHAN, JEFF, BJÖRN;


    public static Males randMaleName(){
        Males[] maleNames = Males.values();
        Random random = new Random();
        return maleNames[random.nextInt(maleNames.length)];
    }
}
