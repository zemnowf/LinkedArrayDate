import java.util.Date;
import java.util.LinkedList;

public class ListForCheck {

    public long countTimeOfAdding(LinkedList<Integer> list) {
        Date timeOfBeginningOfAdding = new Date();
        for (Integer i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Date timeOfEndingOfAdding = new Date();
        return (timeOfEndingOfAdding.getTime() - timeOfBeginningOfAdding.getTime());
    }
}
