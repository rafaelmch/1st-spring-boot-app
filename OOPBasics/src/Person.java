public class Person {
    // main constructor
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    // second constructor
    public Person(String name){
        setName(name);
        setAge(0);
    }

    // Attributes (fields)
    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        } else {
            //System.out.println("Age must be positive!");
            throw new IllegalArgumentException("Age must be positive!");
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Methods (behavior)
    public void sayHello(){
        System.out.println("Hello! My name is: " + name);
    }

    public void myAgeIs(){
        System.out.println("My age is: " + age);
    }
}


