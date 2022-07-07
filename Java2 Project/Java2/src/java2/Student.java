/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class Student extends Employee {
  
   private String name;
   private String disciplines;
    ArrayList<Subject> SubjectList = new ArrayList<>();
   
   public Student() {
        super.setId(null);
        this.name = null;
        this.disciplines = null;
    }
    public Student(String id, String name, String disciplines) {
        super.setId(id);
        this.name = name;
        this.disciplines = disciplines;
    }

   
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }

  public void setId(String id) {
        super.setId(id);
        
    }
    public String getDisciplines() {
        return disciplines;
    }

    public boolean setDisciplines(String disciplines) {
        this.disciplines = disciplines;
        return true;
    }
 
 
    public void printSubject(){
    for(Subject sub : SubjectList){
        System.out.println(sub);
    }
    
    }
public void removeSubject(Subject s) {
        this.SubjectList.remove(s);
       
    }
     public Subject getSubject(String id) {
       for(Subject f : SubjectList){
        if(id.equals(f.id)){
         return f;
        }
       }
       return null;
    }
   
  
    @Override
    public String toString(){
        return String.format(" 1 - Student name : %s\n 2 - Student id : %S\n 3 - Student disciplines : %s \n" , name , super.getId() , disciplines);
    }
    
    
}
