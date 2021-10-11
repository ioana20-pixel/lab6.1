package App.Classes;

public class Professor extends Employee{

    private int m;

    public Professor(int salary, String function, boolean isHired, int m) {
        super(salary, function, isHired);
        this.m = m;
        super.function = "Professor";
        super.isHired = true;

    }


    @Override
    public void sayHi() {
        super.sayHi();
    }

    public void sayHi(String toPerson){

    }

    public boolean equals(Object c){

        if( c instanceof Professor){
            return super.equals(0);
        }
        return false;
    }

}
