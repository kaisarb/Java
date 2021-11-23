import java.util.Scanner;

public class Solution_printf {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String p1 = String.format("%-15s", s1);
                String p2 = String.format("%03d" , x);
                String p3 = p1 + p2;
                System.out.println(p3);
            }
            System.out.println("================================");

    }
}

