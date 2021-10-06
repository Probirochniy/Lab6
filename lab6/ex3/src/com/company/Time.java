package com.company;
import java.util.Scanner;
public class Time{

    static class TimeCreator{
        public int hours;
        public int minutes;
        public int seconds;

        public TimeCreator (int hours, int minutes, int seconds){
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TimeCreator time1 = new TimeCreator(12,12,13);
        TimeCreator time2 = new TimeCreator(16,2,48);
            System.out.print("Input time 1(h - enter - m - enter - s - enter): ");
            time1.hours = in.nextInt();
            time1.minutes = in.nextInt();
            time1.seconds = in.nextInt();

            System.out.print("Input time 2(h - enter - m - enter - s - enter): ");
            time2.hours = in.nextInt();
            time2.minutes = in.nextInt();
            time2.seconds = in.nextInt();

        System.out.println("Time1: " + time1.hours + ":" + time1.minutes + ":" + time1.seconds);
        System.out.println("Time2: " + time2.hours + ":" + time2.minutes + ":" + time2.seconds);

        if(time1.seconds > time2.seconds )
        {
            time2.seconds += 60;
            time2.minutes--;
        }
        if(time1.minutes > time2.minutes )
        {
            time2.minutes += 60;
            time2.hours--;
        }

        int hdif = time2.hours - time1.hours;
        int mdif = time2.minutes - time1.minutes;
        int sdif = time2.seconds - time1.seconds;
        System.out.println("Difference: " + hdif + ":" + mdif + ":" + sdif);
    }
}
