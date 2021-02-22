import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ListForCheck newList = new ListForCheck();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Время добавления миллиона элементов в линкед лист занимает "
                + newList.countTimeOfAdding(list) + " милисекунд");

        ArrayForCheck newArray = new ArrayForCheck();
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Время добавления миллиона элементов в array list занимает "
                + newArray.countTimeOfAddingToArray(array) + " милисекунд");
    }
}
