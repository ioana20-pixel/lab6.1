import App.Classes.Employee;
import App.Classes.Professor;
import App.Classes.Student;
import App.Interfaces.IPerson;

public class Main {
    public static void main(String[] args) {

        IPerson person = new Student();
        System.out.println(person instanceof Student);
    }

}
