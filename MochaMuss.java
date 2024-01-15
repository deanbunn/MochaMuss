//import java.time.LocalDate;
//import java.util.*;
import muss.*;

public class MochaMuss {

    public static void main(String[] args){

        System.out.println("Hi Team 5458!");

        //Create Muss People Array
        MussPerson[] arrMussPeople = new MussPerson[3];
        arrMussPeople[0] = new MussPerson("Dean","Roland","Bunn", 2001, 5, 14);
        arrMussPeople[1] = new MussPerson("Steven","","Jones", 2003, 6, 2);
        arrMussPeople[2] = new MussPerson("Regina","","White", 2005, 8, 23);

        for(MussPerson mp : arrMussPeople)
        {
            System.out.println(mp.getDisplayName());
        }

    }

}
