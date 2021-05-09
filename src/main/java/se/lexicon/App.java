package se.lexicon;

import com.sun.javafx.scene.traversal.Direction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(Males.randMaleName() + " " + LastNames.randLastNames());
        System.out.println(Females.randFemaleName() + " " + LastNames.randLastNames());
    }
}
