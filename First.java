import java.util.*;
public class First {

    public static void main(String[] args) {
        int fh=1;
        int sh=1;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter Number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<=arr.length/2;i++)
        {
            fh=fh*arr[i];
            
        }
        for(int i=arr.length;i<=arr.length/2;i--)
        {
            sh*=arr[i];
        }
        if(fh<sh){
            for(int i=arr.length;i<=0;i--){
                System.out.println(arr[i]);

            }
            
            }
            else{
                System.out.println(arr[i]);
            }
        }
        
}
