public class getthebit{
    public static int getbit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getbit(10,1));
        System.out.println(getbit(10,2));
    }
}