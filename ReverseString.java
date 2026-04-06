import java.util.Arrays;

public class ReverseString {

    public static void reverse(char[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        reverse(str);
        System.out.println(Arrays.toString(str));
    }
}
