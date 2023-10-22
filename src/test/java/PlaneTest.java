import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BIZJET, 20, 300.00);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BIZJET, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(20, plane.getCapacity());
    }

    @Test
    public void planeHasWeightLimit(){
        assertEquals(300.00, plane.getTotalWeight(), 0.0);
    }
}
