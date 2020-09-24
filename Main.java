/*
 * Activity 1.1.4
 */
public class Main
{
  public static void main(String[] args)
  {
    int numPeople = 0; // Will increase with each person
    double totalYears = 0; // Will increase when years are added
    double averageYears = 0;
    double years = 11.5;  // I will soon be halfway through my junior year.
    int totalDays = 180;
    totalYears += years;
    double averageDays = 0;
    numPeople++; 

    System.out.println(numPeople);
    System.out.println(totalYears);

    /*
    * TODO 1) Add at least three other people to your program,
    * such as siblings, friends, or neighbors. 
    *
    * TODO 2) Use people that are in different grades to validate
    * your program can work for different school grades. 
    * 
    * TODO 3) For their years in school, use values that indicate 
    * they will soon be halfway through their current
    * school year, as shown in the provided code.
    */
    years = 10.5;
    totalYears += years;
    numPeople++;
    years = 6.5;
    totalYears += years;
    numPeople++;
    years = 3.5;
    totalYears += years;
    numPeople++;
    averageYears = totalYears / numPeople;
    totalDays *= totalYears;
    averageDays = totalDays/numPeople;

    System.out.println(numPeople);
    System.out.println(totalYears);
    System.out.println(averageYears);
    System.out.println(totalDays);
    System.out.println(averageDays);
    /*
    * TODO 4)The average years you and your friends, siblings,
    * neighbors have been in school. 
    *
    * TODO 5) The total days you have all been in school,
    * assuming you spend 180 days per year in school.
    * 
    * TODO 6) The average days you have all spent in school. 
    */
  }
}