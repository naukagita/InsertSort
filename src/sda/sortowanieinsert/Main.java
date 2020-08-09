package sda.sortowanieinsert;

public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[]{3,11,20,8,2,10}; //  [8] = 50

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }

        insertSort(tablica);
        System.out.println("=====================");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }

    }

    public static void insertSort(int[] array) {
        int temp;
        for (int index = 1; index < array.length; index++) {
            if (array[index] < array[index - 1]) {
                int i = index;
                while (i > 0 && array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    i--;
                }
            }
        }
    }




}
