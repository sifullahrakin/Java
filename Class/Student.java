import java.util.*;
public class Student {
    public static void main(String args[]) {
     String name;
     int age;
     String address;
     
     public Student(String name, int age, String address){
         this.name = name;  //variable = argument
         this.age = age;
         this.address = address;
     }
     
     public void setName(String name){
         this.name = name;
     }
     
     public void setAge(int age){
         this.age = age;
     }
     
     public void setAddress(String address){
         this.address = address;
     }
     
     public String getName(){
         return name;
     }
     
      public int getAge(){
         return age;
     }
     
      public String getAddress(){
         return address;
     }
     
     @Override
     public String toString(){
         return("Student name is "+this.getName()+", age is: "+this.getAge()+" and address is "+this.getAddress);
     }
     
     public static void main(String[] args){
         Student join = new Student("John", 25, "23 East California");
         System.out.println(john.toString());
         
         System.out.println(john.getName());
         System.out.println(john.getAge());
         System.out.println(john.getAddress());
     }
    }
}