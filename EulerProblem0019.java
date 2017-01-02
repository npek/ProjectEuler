//How many Sundays fell on the first of the month during the twentieth century 
//(1 Jan 1901 to 31 Dec 2000)?

public static void main(String[] args) {
    int monthDay = 0;
    int weekDay = 0;
    int month = 0;
    int year = 0;
    int sundays = 0;
    while (year <= 100) {
        if ((weekDay == 6) && (monthDay == 0) && (year > 0)) sundays++;
        weekDay = (weekDay+1)%7;
        if (month == 1) {
            if ((year%4 != 0) || (year%400 == 0)) {
                monthDay = (monthDay+1)%28;
            }
            else monthDay = (monthDay+1)%29;
        }
        else if ((month == 3) || (month == 5) || (month == 8) || (month == 10)) {
            monthDay = (monthDay+1)%30;
        }
        else {
            monthDay = (monthDay+1)%31;
        }
        if (monthDay == 0) {
            month = (month+1)%12;
            if (month == 0) year++;
        }
    }
    System.out.println(sundays);
}