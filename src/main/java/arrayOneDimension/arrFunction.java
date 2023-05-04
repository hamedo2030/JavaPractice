package arrayOneDimension;

public class arrFunction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int number = 1;
        int index = search(arr, arr.length, number);
        if (index != -1) {
            System.out.println("number [" + number + "] at index [" + index + "]");
        } else {
            System.out.println("number not found");
        }
    }

    public static int search(int[] arr, int size, int number) {
        int key = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                key = i;
                break;

            }
        }

        return key;
    }
}
