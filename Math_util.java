package practice;

public class Math_util {
	public static boolean prime(int num) {
		int floor_sqrt = (int)Math.sqrt(num);
		for(int i = 2; i<= floor_sqrt; i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}

	public static int[] sorting(int arr[], int len) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < len - 1; i++) {
            swapped = false;
            for (j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            
            if (swapped == false)
                break;
		    }
		return arr;
	}
}
