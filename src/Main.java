import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(10, 4, 5, 6, 7, 2, 2, 9));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 4, 3, 4, 4));

        task1.equalityList(arrayList1, arrayList2);
        task2.checkArray(arrayList1, arrayList2, 4);
        task3.sortEven(arrayList1);
        task4.delEven(arrayList1);
    }
}