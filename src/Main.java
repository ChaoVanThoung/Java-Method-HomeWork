import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int wordCount(String word) {
        int count = 0;
        for(int i = 0; i < word.length() -1 ; i++) {
            if(word.trim().charAt(i) == ' ') {
                count++;
            }
        }
        return ++count;
    }
    public static int[] sort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++){
                if(num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.print("Please Input Word: ");
        String word = new Scanner(System.in).nextLine();
        System.out.println(wordCount(word));
        int[] number = {5,3,2,1,6,4};
        System.out.println(Arrays.toString(sort(number)));
    }
}
