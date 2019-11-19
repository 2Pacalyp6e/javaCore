import java.util.*;

public class DayOfWeekMain {
    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOW.MONDAY));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        DayOW today = DayOW.convertIntToDay(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("До окончания рабочей недели: "+getWorkingHours(today) + " Часа(ов)");
    }

    public static int getWorkingHours(final DayOW currentDay) {
        int hours=0;
        if (currentDay != DayOW.SUNDAY){
            for(DayOW day: DayOW.values()){
                if(day.getDayNumber() >= currentDay.getDayNumber()){
                    hours+=day.getWorkHours();
                }
            }
        }
        return hours;

    }
}