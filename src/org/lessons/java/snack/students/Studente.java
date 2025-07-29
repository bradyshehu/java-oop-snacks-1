package org.lessons.java.snack.students;

public class Studente {
    private String firstName;
    private String lastName;
    private int age;

    public Studente (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    public String getName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public int getAge () {
        return age;
    }
    public String getStudentInfos() {
        return firstName + " " + lastName + ", " + age + " anni.";
    }

}
