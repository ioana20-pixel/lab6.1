package App.Classes;

import App.Interfaces.IPerson;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public abstract class Employee implements IPerson {

    private int salary;
    public String function;
    protected boolean isHired;

    public Employee(int salary, String function, boolean isHired){
        this.salary = salary;
        this.function = function;
        this.isHired = isHired;
    }

    @Override
    public void sayHi() {
        System.out.println("Greetings!");
    }

    @Override
    public String generateCNP() {
        System.out.println("Introduceti CNP");
        Scanner in = new Scanner(System.in);
        String cnp = in.nextLine();
        System.out.println("Your CNP is " + cnp);
        return null;
    }

    @Override
    public boolean isMajor() {
        System.out.println("Enter birth year: ");
        Scanner in = new Scanner((System.in));
        int year = in.nextInt();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Bucharest"));
        int age = cal.get(Calendar.YEAR) - year;
        if(age >= 18) return true;

        return false;
    }

}
