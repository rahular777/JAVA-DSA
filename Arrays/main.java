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
        // System.out.println(arr_1[0][0]); //56
        // System.out.println(arr_1[0][1]);//32
        // System.out.println(arr_1[0][2]);//42

        // System.out.println(arr_1[1][0]);//12
        // System.out.println(arr_1[1][1]);//13
        // System.out.println(arr_1[1][2]);//14

        // System.out.println(arr_1[2][0]);//10
        // System.out.println(arr_1[2][1]);//11
        // System.out.println(arr_1[2][2]);//13

        // System.out.println(arr_1[0].length);

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
}








class main{
    public static void main(String[] args) {
        Array_examples obj1=new Array_examples();
        // obj1.one_dimensional();
        obj1.multiArrays();

        // obj1.traversing();


    }


    }
