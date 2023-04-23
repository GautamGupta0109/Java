import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.print("Enter the Array elements: ");
        
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0 , j =n-1;
            while(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        System.out.print("Your array elements are: ");
        for(int k = 0 ; i<n ; k++){
            System.out.print(arr[k] + ",");
        }
        sc.close();
    }
}
