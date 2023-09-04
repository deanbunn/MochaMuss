import java.time.LocalDate;


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
     private String _FirstName;
     private String _MiddleName;
     private String _LastName;
     private LocalDate Birthday;
     
     public MussPerson(String fName, String mName, String lName,int bYear, int bMonth, int bDayOfMonth)
     {
        _FirstName = fName;
        _MiddleName = mName;
        _LastName = lName;
        Birthday = LocalDate.of(bYear,bMonth,bDayOfMonth);
     }

     public String getDisplayName()
     {
        String displayName = "";

        if(_MiddleName != null && _MiddleName.isEmpty() == false)
        {
            displayName = _FirstName + " " + _MiddleName + " " + _LastName;
        }
        else
        {
            displayName = _FirstName + " " + _LastName;
        }

        return displayName;
     }

     public LocalDate getBirthDay()
     {
        return Birthday;
     }
}