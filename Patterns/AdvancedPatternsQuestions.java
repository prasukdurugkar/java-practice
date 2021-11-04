package Patterns;

public class AdvancedPatternsQuestions {
    public static void main(String[] args) {
        int m = 1;
        int n = 6;
        int o = -3;
        
        // Upper section
        for (int i = 1; i <= 3; i++) {
            // for each row
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            int k = n;
            while(k>=1){
                System.out.print(" ");
                k= k-1;
            }
            
            for (int l = -3; l <= o; l++) {
                System.out.print("*");
            }
            m++;
            n = n-2;
            o++;
            
            System.out.println();
        }
        // mid section
        for(int i = 1;i<=2;i++){
            for(int j =1;j<=8;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // bottom section
        int p = 1;
        int q = 2;
        int r = 1;
        for(int i=1;i<=3;i++){
           

           for(int j = 3; j>=p; j--){
               System.out.print("*");
           }
           p = p+1;

           for(int k = 1; k<=q;k++){
            System.out.print(" ");
           }
           q = q +2;
           for(int l = 3; l>=r;l--){
               System.out.print("*");
           }
           r = r+1;
        
            System.out.println();
        }
    }
}
