public class Main {
    public static void main(String[] args) {
        //задача1
        int[] array1 = new int[]{1,2,3};
        double[] array2 = {1.57,7.654,9.986};
        int[] array3 = new int[10];
        //задача2
        for (int i = 0; i < array1.length;i++){
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        for (double arr2 : array2){
            System.out.print(arr2 + ", ");
        }
        System.out.println();
        for (int arr3 : array3){
            System.out.print(arr3 + ", ");
        }
        //задача3
        System.out.println();
        System.out.println();
        for (int i = array1.length - 1; i >= 0;i--){
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0;i--){
            System.out.print(array2[i] + ", ");
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0;i--){
            System.out.print(array3[i] + ", ");
        }

        //задача4
        System.out.println();
        System.out.println();
        for (int i = 0; i < array1.length;i++){
            if (array1[i] % 2 == 1){
                array1[i] = array1[i]+1;
            }
            System.out.print(array1[i] + ", ");
        }
    }
}