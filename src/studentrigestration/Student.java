/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrigestration;

/**
 *
 * @author ABDO
 */
public class Student {
    private String name;
    private String course;
    private String Mobile;

    public Student(String name, String course, String Mobile) {
        this.name = name;
        this.course = course;
        this.Mobile = Mobile;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return Mobile;
    }
    
    
    
}
