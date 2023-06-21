public class SecondLArgestNumber {

    public static void main(String[] args) throws InterruptedException {

        int arr[] = {10,69,70,20,90,10,100};
        System.out.println(findSecondLargest(arr));
    }

    private static int findSecondLargest(int[] arr) {

        int temp = arr[0];
        int secondLargestNumber = 0;

        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]) {

                secondLargestNumber = temp;
                temp = arr[i];

            } else if (secondLargestNumber < arr[i]) {

                secondLargestNumber = arr[i];


            }
        }
        return secondLargestNumber;
    }
}






