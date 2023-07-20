// Calulate Day since BD

class Lab7Q3_xxyyy {
    // First method
    public static void main(String[] args) {
        numDaysFromDate(9, 1, 2004, 5);
    }

    // Second method
    static void numDaysFromDate(int date, int month, int year, int myBD) {
        int daysBornTil31Dec2021 = 0;
        int [] monthD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int Day = 0;
        //calculate day
        for(int i = (month - 1); i <= 11; i++) {
            Day += monthD[i];
        }
        Day -= date;
        
        //calculate year
        for(int y = year; y < 2021; y++) {
            if(y % 4 == 0 || (y % 100 == 0 && y % 400 == 0)) {
                daysBornTil31Dec2021 += 366;
            }
            else{
                daysBornTil31Dec2021 += 365;
            }
        }
        daysBornTil31Dec2021 += Day;
        int daysBornTil2Jan2022 = daysBornTil31Dec2021 + 2; // shift to Sunday Jan 02 2022
        String str = showResult(date, month, year, myBD, daysBornTil2Jan2022);
        System.out.println(str);
    }

    // Third method
    static String showResult(int date, int month, int year, int myBD, int fromNumDaysFromDate) {
        String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int dayFromSun = 0;
        int modResult = fromNumDaysFromDate % 7;
        dayFromSun = 7 - modResult;
        String str = String.format("You were born on %s and have been born for %d days (2 Jan 2022).Your program says %s", dayName[myBD], fromNumDaysFromDate, dayName[dayFromSun]);
        return str;
    }
}