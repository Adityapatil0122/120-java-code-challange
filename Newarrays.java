/*
public class Newarrays {
	public static void main(String[] args) {

		int [] arr = {10 , 20 , 30,40,50};
		for(int n=0;n<arr.length;n++) {
		System.out.print(arr[n]+" " );

		}
	}
}
WAP to find the sum of all elements in the array
 */
public class Newarrays {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int max = arr[0]; // Initialize with the first element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // Check if current element is larger
                max = arr[i];   // Update max
            }
        }
        System.out.println("Max: " + max);
    }
}