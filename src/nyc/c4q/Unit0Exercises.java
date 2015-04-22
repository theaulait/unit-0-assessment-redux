package nyc.c4q;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Unit0Exercises {
    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     * additional information in the comments of each method
     */
    public static void main (String args[]) {
        // Use main to test your methods
        //print();
        //System.out.println(returnPrimitiveBooleanFalse());
        //System.out.println(returnPrimitiveInt55Plus44());
        //System.out.println(returnPrimitiveDouble2Point718());
        //System.out.println(isEven(8));
        //System.out.println(isMultipleOfX(9,3));
        System.out.println(returnSumOfOddNumbersBetween1And100());
        //System.out.println(alternateS1AndS2Xtimes("old", "man", 5));
    }

    public static void print() {
        System.out.println("I'm sorry Dave, I'm afraid I can't let you do that.");
    }

    public static boolean returnPrimitiveBooleanFalse() {
        return false;
    }

    public static int returnPrimitiveInt55Plus44() {
        return 55 + 44;
    }

    public static double returnPrimitiveDouble2Point718() {
        return 2.718;
    }

    public static char returnPrimitiveCharASCII35() {
        return '#';
    }

    public static boolean isEven(int n) {
        return (n%2 == 0);
    }

    public static boolean isMultipleOfX(int n, int x) {

        return (n % x == 0);
    }

    public static int returnSumOfOddNumbersBetween1And100() {
        int num =0;
        for (num=0; num < 100; num++) {
           // if (num %2 != 0) {
           //      num ++;
          //  }
        }
        return num;
    }

        // Starts with [1, 3, 5, ...]
        // Ends with   [..., 95, 97, 99]


    public static int returnSumOfTheFirst200MultiplesOf3() {
        // Starts with [0, 3, 6, ...]
        // Ends with   [..., 591, 594, 597]
      return 0;
    }

    public static boolean isEmptyString(String str) {
        if(str.equals("")) {
            return true;
        }
        else {
        } return false;
    }
    public static String alternateS1AndS2Xtimes(String s1, String s2, int x)
    {
        // Given string `s1`, `s2` and a positive integer `x`,
        // return a string that is equal to s1 + s2 repeated x times.
        // If x is 0 or negative negative, return an empty string `""`.
        // For example:
        //      alternateS1AndS2Xtimes("abra", "cadabra", 0).equals("") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 1).equals("abracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 2).equals("abracadabraabracadabra") == true
        //alternateS1AndS2Xtimes("abra", "cadabra", 3).equals("abracadabraabracadabraabracadabra") == true
        String together = s1 + s2;
        if(x > 0)
        {
            for(int i = 1; i <= x; i++)
            {
                return together;
            }
        }

        {
            return "";
        }
    }

    public static String stringSplit(String s, String splitOn)
    {
        if(s.contains(splitOn))
        {
            String split = s.substring(0, s.indexOf(splitOn));
            return split;
        }else{
            return "";
        }
    }

    public static Singer returnBeyonce() {
      Singer beyonce = new Singer("Beyonce", "USA");
      return beyonce;
    }

    public static Singer returnSingerChild(Singer s1, Singer s2) {
      Singer child = new Singer(s1.getName(), s2.getLocation());
      // should return an instance of Singer with the name of s1 and the location of s2.
      // For example:
      //      Singer queenB = new Singer("Beyonce", "USA");
      //      Singer rihanna = new Singer("Rihanna", "Barbados");
      //      returnSingerChild(queenB, rihanna) ==> returns an instance of Singer with name "Beyonce" and location "Barbados".
      return child;
    }

    public static HashMap<String, Singer> returnSingers() {
        Singer jay = new Singer("Jay-Z", "USA");
        Singer bie = new Singer("Bieber", "Canada");
        Singer drake = new Singer("Drake", "Canada");
        Singer jen = new Singer("Jepsen", "Canada");

        HashMap<String, Singer> artist = new HashMap<String, Singer>();
        artist.put("Beyonce", returnBeyonce());
        artist.put("Jay-Z",jay);
        artist.put("Bieber", bie);
        artist.put("Drake", drake);
        artist.put("Jepsen", jen);

        return artist;
    }

    public static boolean isFromCanada(Singer person) {
        return person.getLocation().equalsIgnoreCase("Canada");
    }

    public static void changeJayZsLocationToLosAngeles(HashMap<String, Singer> people) {
        // people will have the values of the `returnSingers()` method you filled in previously.
        // the city should be set to "Los Angeles"
        // old value of Jay-Z:
        //      Singer(name="Jay-Z",   location="USA")
        // new value of Jay-Z:
        //      Singer(name="Jay-Z",   location="Los Angeles")
    }

    public static void removeJepsenFromSingers(HashMap<String, Singer> people){
        // people will have the values of the `returnSingers()` method you filled in previously.
        // old keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake", "Jepsen"]
        // new keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake"]

    }

    // Bonus Problems
    public static void readFileAndOnlyPrintCanadianCelebrities() {
        // TODO Use Apache Commons CSV and provide boilerplate for reading the file
        // https://commons.apache.org/proper/commons-csv/
      try {
        FileReader fr = new FileReader("celebrities.csv");
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }

    public static void readFileAndPrintCelebrityAges(){
        // TODO similar as above
    }
}
