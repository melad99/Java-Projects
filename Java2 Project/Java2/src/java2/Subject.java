/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

/**
 *
 * @author ahmed
 */
public class Subject {
    String id;
    String name;
    
    public Subject() {
        this.id = null;
        this.name = null;
    }
    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return String.format(" 1 -  Subject Id : %s\n 2 - Subject Name : %s\n " , id , name );
    }
}
