import java.util.*;
public class nestedif{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("a is smallest number");
            }else{
                System.out.println("c is smallest number");
            }
        }else if(b<c){
            System.out.println("b is smallest number");
        }else{
            System.out.println("c is smallest number");
        }
    }
}