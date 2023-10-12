import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    private int score;

    public Student(String name, int score) {
        super(name);
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Student("kis", 80));
        people.add(new Teacher("hosoya", "Math"));

        for (Person p : people) {
            String n;
            if (p instanceof Teacher) {
                n = ((Teacher) p).getName();
            } else {
                n = ((Student) p).getName();
            }

            System.out.println(String.format("こんにちは%sさん", n));
        }
    }
}