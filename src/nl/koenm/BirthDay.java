package nl.koenm;

import java.util.Scanner;

public class BirthDay {

    private int day;
    private int monthInInt;
    private int year;
    private String monthInString;

    private boolean correctAnswer;

    Scanner in = new Scanner(System.in);

    public BirthDay(int d, int m, int y) {
        setDate(d, m, y);
    }

    @Override
    public String toString() {
        return String.format("%02d/%s/%04d", day, monthInString, year);
    }

    public void setDate(int d, int m, int y) {
        year = y;
        setMonth(m);
        setDay(d);
    }

    public void setDay(int d) {


        if (monthInInt == 2) {
            if (year % 4 == 0) {
                do {
                    if (d <= 29) {
                        day = d;
                        correctAnswer = true;
                        break;
                    } else {
                        System.out.printf("It is february in a leap year,%n give a valid value for day between 1-29:");
                        correctAnswer = false;
                        d = in.nextInt();
                    }
                } while (!correctAnswer);
            } else {
                do {
                    if (d <= 28) {
                        day = d;
                        correctAnswer = true;
                        break;
                    } else {
                        System.out.println("It is february in a normal year, \ngive a value value for day 1-28:");
                        correctAnswer = false;
                        d = in.nextInt();
                    }
                } while (!correctAnswer);
            }
        } else if (monthInInt == 1 || monthInInt == 3 || monthInInt == 5 || monthInInt == 7 || monthInInt == 8 || monthInInt == 10 || monthInInt == 12) {
            do {
                if (d < 31) {
                    day = d;
                    correctAnswer = true;
                    break;
                } else {
                    System.out.printf("%s has 31 days, give a valid value 1-31:", monthInString);
                    correctAnswer = false;
                    d = in.nextInt();
                }
            } while (!correctAnswer);
        } else {
            do {
                if (d < 30) {
                    day = d;
                    correctAnswer = true;
                    break;
                } else {
                    System.out.printf("%s has 30 days, give a valid value 1-30", monthInString);
                    correctAnswer = false;
                    d = in.nextInt();
                }
            } while (!correctAnswer);
        }
    }

    public void setMonth(int m) {
        do {
            if (m >= 1 && m <= 12) {
                monthInInt = m;
                correctAnswer = true;
            } else {
                System.out.println("Give a valid value for month 1-12:");
                m = in.nextInt();
                correctAnswer = false;
            }
        } while (!correctAnswer);

        switch (m) {
            case 1:
                monthInString = "January";
                break;
            case 2:
                monthInString = "February";
                break;
            case 3:
                monthInString = "March";
                break;
            case 4:
                monthInString = "April";
                break;
            case 5:
                monthInString = "May";
                break;
            case 6:
                monthInString = "June";
                break;
            case 7:
                monthInString = "July";
                break;
            case 8:
                monthInString = "August";
                break;
            case 9:
                monthInString = "September";
                break;
            case 10:
                monthInString = "October";
                break;
            case 11:
                monthInString = "November";
                break;
            case 12:
                monthInString = "December";
                break;
        }
    }

    public String getSideNote() {
        if (year > 2021) {
            return "\n ~It is impossible that you are already born!";
        } else if (year < 1921) {
            return "\n ~You were born a long time ago!";
        } else {
            return "\n ~You were born in the past century";
        }
    }
}
