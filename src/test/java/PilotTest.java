import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Layla", PilotRank.CAPTAIN, "CPT001");
    }

    @Test
    public void hasName(){
        assertEquals("Layla", pilot.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(PilotRank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicence(){
        assertEquals("CPT001", pilot.getLicenceNo());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Don't call me Shirley.", pilot.flyPlane());
    }


}
