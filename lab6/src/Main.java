import App.Classes.Employee;
import App.Classes.Student;
import App.Interface.IPerson;

public class Main {
    public static void main(String[] args) {

        IPerson person = (IPerson) new Student();
        System.out.println(person instanceof Student);
    }

}
