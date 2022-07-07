
package java2;

import java.util.ArrayList;


public class Teacher extends Employee{
   
   private String name;
   ArrayList<Subject> SubjectList = new ArrayList<>();

    public Teacher() {
        super.setId(null);
        this.name = null;
    }
    public Teacher(String id, String name) {
        super.setId(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        this.name = name;
        return true;
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
    public void printSubject(){
     for(Subject sub : SubjectList){
         System.out.println(sub);
     }
    }
      
   @Override
    public String toString(){
        return String.format(" 1 - Teacher name : %s\n 2 - Teacher id : %s\n " , name , super.getId() );
    }
}
