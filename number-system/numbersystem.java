import java.util.*;;
class numbersystem{
    public static void main(String[] args) {

        // //binary to decimal
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Enter the binary_number");
        // int binary_number=scan.nextInt();
        // int ans=0;
        // int pw=1;
        // while (binary_number>0) {
        //     int unitdigit=binary_number%10;
        //     binary_number/=10;
        //     ans+=unitdigit*pw;
        //     pw*=2;
            
        // }
        // System.out.println("the decimal number is:" + ans);

        //Decimal to binary
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int decimal_num=scan.nextInt();
        int ans=0;
        int pw=1;
        while (decimal_num>0) {
            int parity=decimal_num%2;
            decimal_num/=2;
            ans+=parity*pw;
            pw*=10;
        }
        System.out.println("The binary number is:"+ ans);

        
    }
}
