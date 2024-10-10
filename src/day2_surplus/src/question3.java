
class Person {
    private String name;

    public String gender;
    public int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}

public class question3 {
    public static void main(String[] args) {
        Person person = new Person("Prajwal", "male", 22);

        System.out.println("Accessing Name using getter: " + person.getName());

        person.setName("Prajwal Ramkumar Singh");

        person.displayPersonDetails();
    }
}