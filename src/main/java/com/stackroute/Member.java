package com.stackroute;

public class Member {
    String name;
    int age;
    double salary;

}
 class MemberVariable{
    Member member=new Member();

    public String getName(String input){
        if(input=="") {
            String result = "null";
            return result;
        }
    member.name=input;
        return member.name;
    }
     public int getAge(int input){
        if(input<1)
            return 0;
        member.age=input;
         return member.age;
     }
     public double getSalary(double input){
         if(input<1)
             return 0.0;
         else {
             member.salary = input;
             return member.salary;
         }
     }
}
