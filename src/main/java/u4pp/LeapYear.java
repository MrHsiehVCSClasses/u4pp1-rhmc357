package u4pp;

public class LeapYear {
    //`return true` if the argument is a leap year and `false` if the year is not a leap year
    public static boolean isLeapYear(int year){
        boolean check;
        if (year < 1582){
            System.out.println ("year too early not a leap year");
            return false;
        }
        if (year%4 == 0 && (year % 100 != 0)){
            return true;
        }
        else if ((year % 100 == 0) && (year % 400 == 0)){
            check = true;
            if (year % 400 != 0){
                check = false;
            }
            return check;
        }
        return false;
    }
}
