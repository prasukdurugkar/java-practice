import java.util.*;


public class TableOfNumbers {
    public static void main(String[] args) {
        int i = 1;
        int s = 0;
        

        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        System.out.println();
        while (i<=10) {
           System.out.println(s*i);
           i++;
        }


    }
}
