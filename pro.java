class arr_problems{

    void sum(){  // calculating the sum of all elements inside the array
        
            int[] num={1,5,3};
            int sum=0;
            for(int i=0;i<num.length;i++){
                sum+=num[i];
    
            }
            System.out.println(sum);
        
    }

    void max(){
        int[] num={1,5,8,6};
        int max=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
    }
     //it is also a liner search
    void find(){//serach the given element x in the array.ifpresent then return the index else return -1;
        int[] num={1,5,30,45,52,36,85,45,2,3};
        int x=30;
        int ans=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]==x){
                ans=i;
                break;

            } 
           
        }
        System.out.println("Found" +" "+ x + "at index" + ans);

    }


}










public class pro {
    public static void main(String[] args) {
        arr_problems obj1=new arr_problems();
        // obj1.sum();
        // obj1.max();
        obj1.find();
    }
    
        
    }

