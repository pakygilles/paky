import junit.framework.TestCase;

public class RobotTest extends TestCase {

    public void testFire() {
       // Tester le tir d'un robot sur un autre robot
        Robot  r1 = new Robot("paky");
        Robot  r2 = new Robot("carelle");
        r1.setPV(5);
        r2. Fire(r1);

        assertEquals(r1.getPV(),3);
    }

    public void testIsDead() {

    }

    public void testGetNom() {
    }

    public void testGetPV() {
    }

    public void testSetPV() {
    }
}