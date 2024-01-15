
package muss;

import java.time.LocalDate;

public class MussPerson {
    
    public String nameFirst;
    public String nameMiddle;
    public String nameLast;
    public String nameDisplay;
    public int abilityScoreStrength;
    public int abilityScoreDexerity;
    public int abilityScoreConstitution;
    public int abilityScoreIntelligence;
    public int abilityScoreWisdom;
    public int abilityScoreCharisma;
    public LocalDate birthday;

     
    public MussPerson(String initFirstName, String initMiddleName, String initLastName,int initBirthYear, int initBirthMonth, int initBirthDayOfMonth)
    {

        setFirstName(initFirstName);
        setMiddleName(initMiddleName);
        setLastName(initLastName);
        setDisplayName();
        setBirthDay(LocalDate.of(initBirthYear,initBirthMonth,initBirthDayOfMonth));
        
    }

    public String getFirstName()
    {
        return nameFirst;
    }

    public void setFirstName(String nwFirstName)
    {
        nameFirst = nwFirstName;
    }

    public String getMiddleName()
    {
        return nameMiddle;
    }

    public void setMiddleName(String nwMiddleName)
    {
        nameMiddle = nwMiddleName;
    }

    public String getLastName()
    {
        return nameLast;
    }

    public void setLastName(String nwLastName)
    {
        nameLast = nwLastName;
    }

    public String getDisplayName()
    {
        return nameDisplay;
    }

    public void setDisplayName()
    {
        //Check for Middle Name to Show in Display Name
        if(nameMiddle != null && nameMiddle.isEmpty() == false)
        {
            nameDisplay = nameFirst + " " + nameMiddle + " " + nameLast;
        }
        else
        {
            nameDisplay = nameFirst + " " + nameLast;
        }

    }

    public LocalDate getBirthDay()
    {
        return birthday;
    }

    public void setBirthDay(LocalDate nwBirthDay)
    {
        birthday = nwBirthDay;
    }
     
}
