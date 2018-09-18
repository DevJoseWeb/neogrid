package test.com.neogrid;

import com.neogrid.bo.Slot;
import com.neogrid.bo.Talk;
import com.neogrid.util.ConferenceUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

/**
 * Created by Jose RF Junior
 */
public class SlotTest {

    @Test
    public void testHasRoomForTalk() {

        Calendar slotStartTime = ConferenceUtils.getCalendarTime(9, 00);
        Slot slot = new Slot(50, slotStartTime);

        Talk talk1 = new Talk("Valid Talk", 45);
        Assert.assertTrue(slot.hasRoomFor(talk1));

        Talk talk2 = new Talk("InValid Talk", 60);
        Assert.assertFalse(slot.hasRoomFor(talk2));

    }
}
