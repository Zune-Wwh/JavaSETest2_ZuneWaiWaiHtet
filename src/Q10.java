//Aggregation

class Marks{
    int Myanmar;
    int English;
    int Maths;

    public Marks(int myanmar, int english, int maths) {
        Myanmar = myanmar;
        English = english;
        Maths = maths;
    }
}

class Student{
    String name;
    int age;
    Marks marks;

    public Student(String name, int age, Marks marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Student student1 = new Student("Helen", 20, new Marks(75,80,100));
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.marks.Myanmar);
        System.out.println(student1.marks.English);
        System.out.println(student1.marks.Maths);
    }
}
