package Recursion;
public class sum {
    public static void main(String args[]){
        
        int ans=summ(6);
        System.out.println(ans);


    }
    public static int summ(int n){
        if(n==1){
            return 1;
        }


        int temp=summ(n-1);
        return temp+n;

    }
}
