/*
public class Newarrays {
	public static void main(String[] args) {

		int [] arr = {10 , 20 , 30,40,50};
		for(int n=0;n<arr.length;n++) {
		System.out.print(arr[n]+" " );

		}
	}
}
public class Newarrays {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int min = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(min>arr[i]) {
                    min=arr[i];
            }
        }  
                System.out.println(min);
    }    

}
//WAP to find the sum of all elements in the array

public class Newarrays {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 450 };
        int sum = arr[0];
        for(int i=1;i<arr.length;i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    } 
}
 */
public class Newarrays {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
