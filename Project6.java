public class Project6 {
    public static void main(String[] args) {
        pattern61(4);
    }
//    public static void pattern6(int n){
//        for(int row=0;row<2*n;row++){
//            int totalColInRow=row> n?2*n-row:row;
//            int noOFSpaces=n-totalColInRow;
//            for(int s=0;s<noOFSpaces;s++){
//                System.out.print(" ");
//            }
//            for(int col=0;col<totalColInRow;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
public static void pattern61(int n){
    for(int row=0; row<2*n; row++){
        // Determine the number of columns in the current row
        int totalColInRow = row >= n ? 2*n - row - 1 : row + 1;
        // Determine the number of spaces in the current row
        int noOfSpaces = n - totalColInRow;

        // Print spaces
        for(int s=0; s<noOfSpaces; s++){
            System.out.print(" ");
        }
        // Print stars
        for(int col=0; col<totalColInRow; col++){
            System.out.print("*");
        }
        // Move to the next line
        System.out.println();
    }
}
}
