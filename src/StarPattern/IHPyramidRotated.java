package StarPattern;

//Invert Half Pyramid Rotated by 180°

//     *
//    **
//   ***
//  ****
public class IHPyramidRotated {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
