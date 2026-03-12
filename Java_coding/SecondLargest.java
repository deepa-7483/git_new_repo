//Find the Second Largest Number in an Array
public class SecondLargest {
    public static void main(String[] args) {

        int arr[] = {10, 45, 23, 67, 12};

        int largest = arr[0];
        int second = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }

            else if(arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second largest: " + second);
    }
}