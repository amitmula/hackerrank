package hackerRank.amitmula.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        System.out.println(convert(time));
    }

    private static String convert(String time) {
        String[] time_parts = time.split(":");
        int hour = Integer.parseInt(time_parts[0]);
        if(hour<=12 && hour>=1) {
            String tt = time_parts[2].substring(time_parts[2].length()-2);
            if(tt.equalsIgnoreCase("AM") && hour<12)
                return time_parts[0] + ":" + time_parts[1] + ":" + time_parts[2].substring(0,time_parts[2].length()-2);
            else if(tt.equalsIgnoreCase("AM") && hour==12) {
                return "00" + ":" + time_parts[1] + ":" + time_parts[2].substring(0,time_parts[2].length()-2);
            } else if(tt.equalsIgnoreCase("PM") && hour<12){
                return (hour+12) + ":" + time_parts[1] + ":" + time_parts[2].substring(0,time_parts[2].length()-2);
            } else
                return hour + ":" + time_parts[1] + ":" + time_parts[2].substring(0,time_parts[2].length()-2);
        }
        return "";
    }
}
