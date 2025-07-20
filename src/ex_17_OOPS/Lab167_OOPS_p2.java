package ex_17_OOPS;

public class Lab167_OOPS_p2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sleep();
        Student s2;
        new Student();
    }
}
    class Student {
        String name;
        Student(){
            System.out.println("DC");
        }
        void sleep(){
            System.out.println("Hi");
        }
    }

class A{}
class B{}
