public class updatethebit{
    public static int setbit(int n ,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearbit(int n ,int i){
        int bitmask = ~(1<<i);
        return n | bitmask;
    }
    public static int updatebit(int n ,int i , int newbit){
        if(newbit == 0){
            return clearbit(n,i);
        }
        else{
            return setbit(n,i);
        }
    }
    public static void main(String args[]){
        System.out.print(updatebit(10,2,1));
    }
}