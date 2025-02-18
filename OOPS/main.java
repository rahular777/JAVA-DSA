 class student {
    int rollno;
    String studentname;
}

public class main{

    public static void main(String[] args) {
        student obj1=new student();
        obj1.rollno=123;
        obj1.studentname="rahul";
        System.out.println(obj1.rollno);
        System.out.println(obj1.studentname);


        student obj2=new student();
        obj2.rollno=124;
        obj2.studentname="sachin";
        System.out.println(obj2.rollno);
        System.out.println(obj2.studentname);
    }
}

