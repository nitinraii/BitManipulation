public class clearlastibit{
    public static int bit(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.print(bit(10,2));
    }
}