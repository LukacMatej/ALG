package cz.tul.alg1.week7_libraries;
//knihovní třída je sada statických metod
public class DateTimeTools {
        final static int SECONDS_IN_HOUR = 3600;
        final static int SECONDS_IN_MINUTE = 60;
    private DateTimeTools(){
        
    }
    
    /**
     * Converts time in hours, minutes, seconds to seconds
     * @param hours
     * @param minutes
     * @param seconds
     * @return time in seconds
     */
    public static int TimeToSeconds(int hours, int minutes, int seconds){
        int result;
        result = (hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds);
        return result;
    }
    
    /**
     * Tests if the year is leap
     * Přestupný rok je dělitelný 4 s tou vyjímkou, že roky dělitelné 100 jsou 
     * přestupné pouze tehdy, pokud jsou zároveň dělitelné i 400.
     * @param year
     * @return true or false
     */
    public static boolean IsLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
    //zellerův algoritmus
    /**
     * Calculate the day of the week using Zeller algorithm
     * @param day
     * @param month
     * @param year
     * @return the day of the week (1 = monday, 2 = Tuesday, ..., 7 = Sunday)
     */
    public static int weekDay(int day, int month, int year){
        return 5;
    }
}
