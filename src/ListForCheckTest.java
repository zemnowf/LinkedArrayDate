import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class ListForCheckTest {

    @Test
    void countTimeOfAdding() {
        ListForCheck newList = new ListForCheck();
        LinkedList<Integer> list = new LinkedList<>();
        Assert.assertEquals(249, newList.countTimeOfAdding(list));
    }


}