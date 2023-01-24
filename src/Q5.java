//Encapsulation

class Encap{
    private String name;
    private int age;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setName("Ming");
        obj.setAge(19);
        obj.setHobby("Running");


        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getHobby());
    }

}
