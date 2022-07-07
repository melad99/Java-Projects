/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;


public class author {
      private String name;    
    private String email;
    private char gender;
    
public author(String name,String email,char gender){
this.name=name;
this.email=email;
this.gender=gender;
}
public String toString(){
    return String.format("Author[name=%s ,email=%s,gender=%s}" ,name,  email, gender);
}


}
