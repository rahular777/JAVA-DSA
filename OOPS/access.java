public class access {

    public String str_1="I am a public member";

    void printfromclass(){
        System.out.println("with in class:" + str_1);
    }

   public static void main(String[] args) {
    access obj=new access();
    obj.printfromclass();
    System.out.println(obj.str_1);
   }
    
}


class access2{
    void printfromclass(){
        
    }
}
