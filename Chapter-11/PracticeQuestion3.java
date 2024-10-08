import java.util.Scanner;

public class PracticeQuestion3 {
    public static void Transpose(int arr[][]){
        int row= arr.length;
        int col= arr[0].length;
        int transpose[][]= new int[col][row];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                transpose[j][i]= arr[i][j];
            }
        }
        printArray(transpose);
    }
    public static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void inputArray(int arr[][]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print("Enter: ");
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter Row Length: ");
        int row= sc.nextInt();
        System.out.print("Enter Column Length: ");
        int col= sc.nextInt();
        int metrix[][]= new int [row][col];
        inputArray(metrix);
        Transpose(metrix);
    }
}