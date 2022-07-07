/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    
    Subject newSubject = new Subject();
    ArrayList<Employee> employeeList = new ArrayList<>();
    String _id ;
    Scanner in = new Scanner(System.in);
    
    public void addEmployee(Employee h){
       for(Employee s : employeeList ){
          if(h.getId().equals(s.getId())){
              System.out.println("Id already exists");
                  return;  
             }     
        }
        employeeList.add(h);
    }
    public void arryPrint(){
         for(Employee obj : employeeList){
         System.out.println(obj);
         System.out.println("----------------------");
         }	      
      }
    public void addStudent(){
    System.out.println("**************Add new student**************");
      System.out.print("insert Student Id \n" 
                     + ">> ");
          String Id = in.next();
          System.out.print("insert Student Name \n"
                         + ">> ");
          String Name = in.next();
          System.out.print("insert Student disciplines \n" 
                           + ">> ");
          String disciplines = in.next();
    Student st1 = new Student(Id , Name ,disciplines);
    addEmployee(st1);
    }
    public void addTeacher(){
    System.out.println("**************Add new Teacher**************");
        System.out.print("insert Teacher Id \n" 
                       + ">> ");
          String Id = in.next();
          System.out.print("insert Teacher Name \n"
                           + ">> "); 
          String Name = in.next();
    Teacher t1 = new Teacher(Id , Name );
    addEmployee(t1);
    }
    
    public void addSubject(String id , Subject s2 ){
      for(Employee s : employeeList ){
          if(id.equals(s.getId())){
                   if(s instanceof Teacher){
                        Teacher d = (Teacher) s;
                        d.SubjectList.add(s2);
                     }else{
                        Student d = (Student) s;
                        d.SubjectList.add(s2);
                        }
             }     
        }
    }
    public void addSubject(){
        System.out.print("**************Add new Subject**************\n" + 
                           "insert id \n" +
                           ">> ");
                String id = in.next();
        
        System.out.print("*******************************************\n" + 
                         "insert New Subject id \n" 
                       + ">> ");
          String newId = in.next();
          System.out.print("insert New Subject Name \n" 
                           + ">> " );
          String Subject = in.next();
          Subject newSubject = new Subject(newId , Subject);
          addSubject(id , newSubject );
        }
    
    public void showStuSub(){
     System.out.println("**************Show Student Subject**************");
     System.out.print("************************************************\n" + 
                      "insert  Student id \n" 
                    + ">> ");
          String id = in.next();
          for(Employee s : employeeList ){
               if(id.equals(s.getId())){
                   if(s instanceof Student){
                        Student d = (Student) s;
                       d.printSubject();
                   }
                }     
            }
      }
    
    public void showTeaSub(){
     System.out.println("**************Show Teacher Subject**************");
     System.out.print("************************************************\n" + 
                      "insert  Teacher id \n" 
                    + ">> ");
          String id = in.next();
          for(Employee s : employeeList ){
               if(id.equals(s.getId())){
                   if(s instanceof Teacher){
                        Teacher d = (Teacher) s;
                        d.printSubject();
                   }
                }     
            }
     }
   
    public void DeleteEmp(String x){
     for(Employee s : employeeList ){
               if(x.equals(s.getId())){
                  employeeList.remove(s);
                   break;
               }     
        }
        
    }
    public void DeleteT(){
    System.out.println("**************Delete Teacher**************");
          System.out.println("insert Teacher Id \n" 
                           + ">> ");
          String Id = in.next();
          DeleteEmp(Id);
    }
    
    public void DeleteS(){
    System.out.print("**************Delete Student**************");
          System.out.println("insert Student Id \n" 
                           + ">> ");
          String Id = in.next();
          DeleteEmp(Id);
    }
    public void deleteSubject(){
    System.out.println("************** Delete  Subject **************");
          System.out.print("insert  Id \n" 
                         + ">> " );
          String Id = in.next();
          deleteSubject(Id);
    }
    public void deleteSubject(String x){
          for(Employee s : employeeList ){
               if(_id.equals(s.getId())){
                   if(s instanceof Teacher){
                   Teacher d = (Teacher) s;
                   d.removeSubject(d.getSubject(x));
                   }else{
                        Student d = (Student) s;
                        d.removeSubject(d.getSubject(x));
                   }
               }     
            }
    }
    public void studentEdit(){
         System.out.print("************** Student  Edit **************\n" +
                            "Insert Student Id \n" +
                            ">> "  );
         String id = in.next();
         if ( studentInfo(id) == true){
          System.out.print(" Insert numbrt of edit \n" + 
                             ">> ");
          int num = in.nextInt();
             switch (num) {
                 case 1:
                     {
                         System.out.print(" Insert the new name \n"+
                                 ">> ");
                         String x = in.next();
                         for(Employee s : employeeList){
                             if(id.equals(s.getId())){
                                 if(s instanceof Student){
                                     ((Student) s).setName(x);
                                 }
                             }
                         }        break;
                     }
                 case 2:
                     {
                         System.out.print(" Insert the new Id \n"+
                                 ">> ");
                         String x = in.next();
                         for(Employee s : employeeList){
                             
                             if(id.equals(s.getId())){
                                 if(s instanceof Student){
                                     s.setId(x);
                                 }
                             }
                         }        break;
                     }
                 case 3:
                     {
                         System.out.print(" Insert the new disciplines \n"+
                                 ">> ");
                         String x = in.next();
                         for(Employee s : employeeList){
                             
                             if(id.equals(s.getId())){
                                 if(s instanceof Student){
                                     ((Student) s).setDisciplines(x);
                                 }
                             }
                         }        break;
                     }
                 default:
                     System.out.println("Choose vali Number !");
             }
          
         }
                           
        
         
     
     }
    public boolean studentInfo(String x){
         System.out.println("************** Student  Information **************");
                      boolean t = false; 
                    for(Employee s : employeeList){
                        if(x.equals(s.getId())){
                            if(s instanceof Student){
                               Student d = (Student) s;
                               System.out.println(d.toString());
                                t = true;
                               }
                            }else{t = false;
                            System.out.println("Cant find");
                            
                                 }
                    }
                    return t;
          }
    public void Start(){
        System.out.println("***********نظام القبول والتسجيل**********");
        System.out.println("Welcome !");
        System.out.println("if you are the Admin insert 1 , Student insert 2");
        System.out.print(">> " );
        int x = in.nextInt();
        empDetect(x);
        
    }
    public boolean passDetect(){
        System.out.println("Insert the password " );
          System.out.print(">> " );
          String y = in.next();
          this._id = y;
          boolean var;
                 for(Employee s : employeeList ){
                       if( y.equals(s.getId())){
                           if(s instanceof Student){
                               Student x = (Student) s;
                               System.out.println("Welcome : " + x.getName());
                           var = true;
                           }else{var = false;}
                          return var;
                       }
                 }
                 
    return true;
    }
    public void empDetect(int x){
      if(passDetect() == true){
      
       if(x == 1){
           System.out.println("Welcome : Ahmed" );
          StartAdmin();
        }else if(x == 2){StartStudent();
           System.out.println("");
        }else{System.out.println("Plese try again !");} 
      }else{System.out.println("The password is wrong !");}
         

    }
    public void StartAdmin(){
        System.out.println("Select your operation !");
        System.out.println("1 - Add new Student \n" + 
                           "2 - Add new Teacher \n" 
                +          "3 - Add new Subject \n"
                +          "4 - Delete Student \n" 
                +          "5 - Delete Teacher \n"
                +          "6 - Delete Subject \n"
                +          "7 - Edit Student Info \n"
                +          "8 - Show Student Subject \n"
                +          "9 - Show Teacher Subject \n"
                +          "10 - Print Student & Teacher \n"
                +          "11 - Back to main \n"
                +          "12 - Exit");
        resetOpMan();
    }
    public void StartStudent(){
        System.out.println("Select your operation !");
        System.out.println( 
                           "1 - Add new Subject \n"
                +          "2 - Delete Subject \n"
                +          "3 - View Student Subjects \n"
                +          "4 - Back to main \n"
                +          "5 - Exit");
       resetOpStu();
    }
    public void resetOpMan(){
        System.out.print("Select your ! \n" + 
                         ">> ");
        int x = in.nextInt();
        AdminState(x);
        
    }
    public void resetOpStu(){
        System.out.print("Select your ! \n" + 
                         ">> ");
        int x = in.nextInt();
        studentState(x);
        
    }
    public void AdminState(int x){
       switch(x) {
    case 1:
        addStudent();
        resetOpMan();
    break;
    
    case 2:
        addTeacher();
        resetOpMan();
    break;
    
    case 3:
        addSubject();
        resetOpMan();
    break;
    
    case 4:
        DeleteS();
        resetOpMan();
    break;
    
    case 5:
        DeleteT();
        resetOpMan();
    break;
    
    case 6:
        deleteSubject();
        resetOpMan();
    break;
    
    case 7:
        studentEdit();
        resetOpMan();
    break;
    case 8:
        showStuSub();
        resetOpMan();
    break;
    
    case 9:
        showTeaSub();
        resetOpMan();
    break;
    
    case 10:
        arryPrint();
        resetOpMan();
    break;
    case 11:
        Start();
      passDetect();
    break;
    case 12:
        System.exit(0);
    break;
  default:
    System.exit(0);
}
  
    }
    public void studentState(int x){
       switch(x) {
    case 1:
        addSubject();
        resetOpStu();
    break;
    
    case 2:
        deleteSubject();
        resetOpStu();
    break;
    
    case 3:
        showStuSub();
        resetOpStu();
    break;
    
    case 4:
        Start();
        passDetect();
    break;
    case 5:
        System.exit(0);
    break;
    
  default:
      System.exit(0);
    
}
}
}
