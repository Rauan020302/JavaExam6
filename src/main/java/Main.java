import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1L,"Alex",70,18,"Male");
        Student student2 = new Student(2L,"John",77,19,"Male");
        Student student3 = new Student(3L,"Scarlett",90,20,"Female");
        Student student4 = new Student(4L,"Victoria",60,16,"Female");
        Student student5 = new Student(5L,"Jack",55,33,"Male");
        Student student6 = new Student(6L,"Jordon",78,22,"Male");
        Student student7 = new Student(7L,"Margo",63,17,"Female");
        Student student8 = new Student(8L,"Tom",36,18,"Male");
        Student student9 = new Student(9L,"Robert",56,28,"Male");
        Student student10 = new Student(10L,"Harry",67,26,"Male");
        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        System.out.println(students);
        getNamesList(students);
        getNamesListByAge(students,20);
        printAnonymously(students);
        getNamesFirstLetterList(students);
    }
    public static List<Student> getNamesList(List<Student> students){
        for (Student student : students) {
            System.out.println(student.getName());
        }
        return students;
    }
    public static List<Student> getNamesListByAge(List<Student> students,Integer minAge){
        for (Student student : students) {
            if (student.getAge() > minAge) {
                System.out.println(student.getName());
            }
        }
        return students;
    }
    public static void printAnonymously(List<Student> students){
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Средняя оценка: " + student.getMark());
        }
    }
    public static List<Student> getNamesFirstLetterList(List<Student> students){
        for (Student student : students) {
            System.out.println(student.getName() + " -> " + student.getName().charAt(0) + student.getName().length());
        }
        return students;
    }
}
