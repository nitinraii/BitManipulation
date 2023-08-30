public class oddevenbit{
    public static void oddeven(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            System.out.print("number is even");
    }
    else{
        System.out.print("number is odd");
    }
}
public static void main(String args[]){
    oddeven(3);
    oddeven(7);
    oddeven(2);
}
}