package labbase;

public class Student {
    private final String name;
    private final Email email;
    private final int age;
    private final JobHunting jobHunting;

    public Student(final String name, final Email email, final int age, final JobHunting jobHunting) {
        if(name == null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        if(email == null){
            throw new IllegalArgumentException("Email cannot be null");
        }
        if(jobHunting == null){
            throw new IllegalArgumentException("JobHunting cannot be null");
        }

        this.name = name;
        this.email = email;
        this.age = age;
        this.jobHunting = jobHunting;
    }
}