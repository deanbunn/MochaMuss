import java.time.LocalDate;


public class MochaMuss {

    public static void main(String[] args){

        System.out.println("Hi Team 5458!");

        //Create Muss People Array
        MussPerson[] arrMussPeople = new MussPerson[3];
        arrMussPeople[0] = new MussPerson("Dean Bunn", 2001, 5, 14);
        arrMussPeople[1] = new MussPerson("Steven Pragg", 2003, 6, 2);
        arrMussPeople[2] = new MussPerson("Regina White", 2005, 8, 23);

        for(MussPerson mp : arrMussPeople)
        {
            System.out.println(mp.getName());
        }

    }

}

class MussPerson
{
     private String FullName;
     private LocalDate Birthday;
     
     public MussPerson(String fullName,int bYear, int bMonth, int bDayOfMonth)
     {
        FullName = fullName;
        Birthday = LocalDate.of(bYear,bMonth,bDayOfMonth);
     }

     public String getName()
     {
        return FullName;
     }

     public LocalDate getBirthDay()
     {
        return Birthday;
     }
}