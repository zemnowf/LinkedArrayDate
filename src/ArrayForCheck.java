import java.util.ArrayList;
import java.util.Date;

public class ArrayForCheck {

    public long countTimeOfAddingToArray(ArrayList<Integer> array){
        Date date1 = new Date();
        for (Integer i = 0; i < 1000000; i++) {
            array.add(i);
        }
        Date date2 = new Date();
        return (date2.getTime() - date1.getTime());
    }
}
