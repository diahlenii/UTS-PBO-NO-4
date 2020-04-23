/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class CourseDemo {
    public static void main(String[] args)
    {
        
        Instructor myInstructor = new Instructor("Kramer", "Shawn", "RH3010");
        
        TextBook myTextBook = new TextBook("Starting Out With Java", "Gaddis", "Pearson");
        
        Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);
        
        System.out.println(myCourse);
    }
}
