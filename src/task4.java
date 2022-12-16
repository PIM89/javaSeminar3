import java.util.ArrayList;
import java.util.Iterator;

// На вход приходит ArrayList<Integer> удалите из него четные числа (на итератор)

public class task4 {
    public static void delEven(ArrayList<Integer> arrayList1) {
        Iterator iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            Object num = iterator.next();
            if ((int) num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(arrayList1);
    }
}
