package de.project.project1;

public class Vergleichen {

    public static String [] getListe(int eingabe){
        String [] feld = new String [eingabe];

        for(int i = 0; i < feld.length;i++){
            feld[i] = ""+(i+1);
            if((i+1) %3 == 0)
                feld[i] = "Fizz";
            if((i+1) %5 == 0)
                feld[i] = "Buzz";
            if((i+1) %3 == 0 && (i+1) %5 == 0)
                feld[i] = "FizzBuzz";
        }
        return feld;
    }
}
