package se.lexicon;

import java.util.Random;

public enum LastNames {
    ANDERSSON, ERIKSSON, BERGGREN, DRUGGE, FRISK, BERGWALL, WALLIN, PERSSON, PETERSSON, OLIN, BLANK,
    FORSMARK, OLSSON, WILLIAMSSON, RUTGERSSON, BLIDH, RUNDMARK, ANDREN, WIKMARK, TURESSON, BENGTSSON, WARG,
    BROBERG, ONGARO, EVEDIN, GÖRANSSON;

    public static LastNames randLastNames(){
        LastNames[] lastNames = LastNames.values();
        Random random = new Random();
        return lastNames[random.nextInt(lastNames.length)];
    }
}
