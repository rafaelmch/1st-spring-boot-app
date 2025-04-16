public class Student extends Person{
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major == null || major.isEmpty()) {
            throw new IllegalArgumentException("Major cannot be empty!");
        }
        this.major = major;
    }

    public void isStudying(){
        System.out.println("Student " + getName() + ", aged " + getAge() + ", " + "is studying " + major);
    }

}
