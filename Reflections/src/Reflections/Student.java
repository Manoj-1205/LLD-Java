package Reflections;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
    private Integer rollno;
    private String name;
    private String email;

    public Student(Integer rollno, String name, String email){
        this.rollno = rollno;
        this.name = name;
        this.email = email;
    }



}
