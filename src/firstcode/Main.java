package firstcode;

public class Main {
    public static void main(String[] args) {
        int[] boo = {0, 1, 2, 3, 4};

        int[] far = new int[100];
        for(int i = 0; i < 100; i++){
            far[i] = i;
        }

        System.out.println("The number of even numbers in boo is: " + countEvenNum(boo, 5));
        System.out.println("The number of even numbers in far is: " + countEvenNum(far, 100));
    }

    private static int countEvenNum(int[] arr, int size){
        int count = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

