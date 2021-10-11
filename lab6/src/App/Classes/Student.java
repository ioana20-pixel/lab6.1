package App.Classes;
import App.Interfaces.IPerson;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Student implements IPerson {
    @Override
    public void sayHi() {
        System.out.println("Hi there!");
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
