package nl.koenm;

public class Person {
    private String name;
    private BirthDay birthDay;

    public Person(String theName, BirthDay theDate){
        System.out.printf("My name is %s and I am born on %s", theName, theDate);
        System.out.println(theDate.getSideNote());
    }




}
