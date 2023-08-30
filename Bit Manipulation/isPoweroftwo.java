public class isPoweroftwo{
    public static boolean poweroftwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.print(poweroftwo(8));
    }
}