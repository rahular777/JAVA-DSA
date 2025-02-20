import java.util.*;
class Array_examples{

    void one_dimensional(){
            int[] ages=new int[5];
            double[] weights =new double[5];
            String[] name=new String[5];
    
            ages[0]=10;
            ages[1]=11;
            ages[2]=12;
            ages[3]=13;
    
           
    
            System.out.println(ages[0]);
            System.out.println(ages[1]);
            System.out.println(ages[2]);
            System.out.println(ages[3]);
    
    }

    void multiArrays(){

        int[][] arr_1={{56,32,42,56,25},{12,13,14},{10,11,13}};
        

        for(int i=0;i<arr_1.length;i++){
            for(int j=0;j<arr_1.length;j++){
            System.out.println(arr_1[i][j]);
        }
    }



    }

    void traversing(){
        int[] age ={1,2,3,45,55};

        // for(int i=0;i<=age.length;i++){
        //     System.out.println(age[i]);
        // }

        // for(int ages:age){
        //     System.out.println(ages);
        // }

        int i=0;
        while (i<age.length) {
            System.out.println(age[i]);
            i++;
            
        }
    }


    void array_input(){
         
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=scan.nextInt();
        int[] age=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<age.length;i++){
            age[i]=scan.nextInt();
        } 

        for(int i=0;i<n;i++){
            System.out.println("the elemets are :"+ age[i]);
        }
        

        }
    }









class main{
    public static void main(String[] args) {
        Array_examples obj1=new Array_examples();
        // obj1.one_dimensional();
        // obj1.multiArrays();

        // obj1.traversing();
        obj1.array_input();


    }


    }
