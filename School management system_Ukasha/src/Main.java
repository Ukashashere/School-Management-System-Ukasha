import java.util.ArrayList;
import java.util.List;

/**
 * Declearing Main class.
 */
public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Student Tamanna = new Student(1,"Tamanna",4);
        Student Ukasha = new Student(2,"Ukasha Ahmad",12);
        Student Rahul = new Student(3,"Rahul",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Tamanna);
        studentList.add(Rahul);
        studentList.add(Ukasha);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        Tamanna.payFees(5000);
        Ukasha.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(Ukasha);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);


    }
}
