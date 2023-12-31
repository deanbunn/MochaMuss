import java.time.LocalDate;
//import java.util.*;


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

class MussPerson
{

    public String firstName;
    public String middleName;
    public String lastName;
    public String displayName;
    public int strengthScore;
    public int dexterityScore;
    public int constitutionScore;
    public int intelligenceScore;
    public int wisdomScore;
    public int charismaScore;
    public LocalDate birthday;
    
     
    public MussPerson(String fName, String mName, String lName,int bYear, int bMonth, int bDayOfMonth)
    {

        firstName = fName;
        middleName = mName;
        lastName = lName;
        strengthScore = 0;
        dexterityScore = 0;
        constitutionScore = 0;
        intelligenceScore = 0;
        wisdomScore = 0;
        charismaScore = 0;
        birthday = LocalDate.of(bYear,bMonth,bDayOfMonth);

        //Configure Initial Display Name
        if(mName != null && mName.isEmpty() == false)
        {
            displayName = firstName + " " + middleName + " " + lastName;
        }
        else
        {
            displayName = firstName + " " + lastName;
        }

    }

     public String getDisplayName()
     {
        return displayName;
     }

     public LocalDate getBirthDay()
     {
        return birthday;
     }
}