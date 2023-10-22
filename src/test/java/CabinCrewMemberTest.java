import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Holly", CabinCrewRank.PURSER);
    }

    @Test
    public void hasName(){
        assertEquals("Holly", cabinCrewMember.getName());

    }

    @Test
    public void hasRank(){
        assertEquals(CabinCrewRank.PURSER, cabinCrewMember.getRank());
    }

    @Test
    public void canSpeak(){
        assertEquals("Welcome to JavaAir!", cabinCrewMember.welcomeMessage());
    }

}
