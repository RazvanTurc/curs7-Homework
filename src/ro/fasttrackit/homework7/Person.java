package ro.fasttrackit.homework7;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name    = name;
        this.age     = validateAge(age);
        this.married = married;
    }

    public int validateAge(int age) {
        if(age < 1) {
            return age = 1;
        } else {
            return age;
        }
    }

    // Getters
    public String getName() { return name; }
    public int getAge()     { return age; }
    public String isMarried() {
        if(married) {
            return "Married";
        } else {
            return "Not Married";
        }
    }



}
