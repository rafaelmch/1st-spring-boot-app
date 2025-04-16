public class Main{
    public static void main(String[] args){
        // Create an object of the Person class
        Person person = new Person("Rafael Masuo Corrêa Hassegawa", 42);
        person.sayHello();
        person.myAgeIs();

        Student rafael = new Student("Raf Hassegawa", 42, "Java");
        rafael.getMajor();

        // Animal X Dog
        Animal lola = new Dog();
        lola.speak();
    }
}