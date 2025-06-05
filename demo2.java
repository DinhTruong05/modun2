class Student {
    String name;
    String ho;

    Student(String name, String ho) {
        this.name = name;
        this.ho = ho;
    }
}

public class demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("Truong", "Dinh");
        System.out.println(s1.name + " " + s1.ho);

        Student s2 = new Student("Minh", "Hoang");
        System.out.println(s2.name + " " + s2.ho);
    }
}