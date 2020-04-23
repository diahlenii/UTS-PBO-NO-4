/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;
    
    public Course(String name, Instructor instr, TextBook text)
    {
       courseName = name;
       instructor = instr;
       textBook = text;
    }
    public String getName()
    {
        return courseName;
    }
    public Instructor getinstructor()
    {
        return instructor;
    }
    public TextBook getTextBook()
    {
        return textBook;
    }
    public String toString()
    {
        String str = "Course name: " +courseName+
                     "\nInstructor Information:\n" +instructor+
                     "\nTextBook Information:\n" +textBook;
        
        return str;
    }
}
