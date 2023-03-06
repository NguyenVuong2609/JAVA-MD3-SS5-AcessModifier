package Rikkei.academy.TH1;

import Rikkei.academy.TH1.Student;


public class TH1_StaticMethod {
    public static void main(String[] args) {
        Student.change();


        Student s1 = new Student(111, "Chinh");
        Student s2 = new Student(222, "Toan");
        Student s3 = new Student(333, "Dung");

        s1.display();
        s2.display();
        s3.display();
    }
}
