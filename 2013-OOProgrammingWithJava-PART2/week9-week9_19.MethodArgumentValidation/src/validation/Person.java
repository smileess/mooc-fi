package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
        
        if (this.name == null || this.name.isEmpty() || this.name.length() > 40) {
            throw new IllegalArgumentException("Name variable can not be  null, empty, or "
                    + "longer than 40 characters.");
            
        }
        
        if (this.age < 0 || this.age > 120) {
            throw new IllegalArgumentException("The age has to be between 0-120.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
