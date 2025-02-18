import java.util.Scanner;

class Algebra{
    int a;
    int b;

    Algebra(int x,int y){
        System.out.println("it is a constructor");
        a=x;
        b=y;

    }
    public int sum(int a,int b){
        int ans=a+b;
        return ans;

    } 

    int add(){
        return a+b;
    }

    int sub(){
        return a-b;
    }

    int mul(){
        return a*b;
    }
}

class main1{
    public static void main(String[] args) {
        Algebra obj1=new Algebra(25,40);
        System.out.println(obj1.sum(25,30));
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());

        Algebra obj2=new Algebra(50,75);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        
        

    }
}

