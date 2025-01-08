//No of blocks,line and words
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter block number:");
        int block=sc.nextInt();
        System.out.println("Enter number of lines:");
        int line=sc.nextInt();
        System.out.println("Enter number of hai:");
        int h=sc.nextInt();
        int c=0;
        for(int i=0;i<block;i++){
            for(int j=0;j<line;j++){
                for(int k=0;k<h;k++){
                    System.out.print("hai ");
                    c++;
                }
                System.out.println();
            }
            System.out.println(c);
            System.out.println("----------------");
        }
    }
}
