import junit.framework.TestCase;

public class ArenaTest extends TestCase {

    public void testFight() {
        // Tester le combat d'un robot et un deuxième robot (méthode de la classe Arena).
        Robot  r1 = new Robot("paky");
        Robot  r2 = new Robot("carelle");

        Arena ar = new Arena();
        assertEquals(ar.Fight(r1,r2),r1);

        // Tester le fait qu'il est impossible de tirer sur un robot mort
        Robot  r3 = new Robot("paky");
        Robot  r4 = new Robot("carelle");
        Arena ar1 = new Arena();
        r3.setPV(0);
        ar.Fight(r3,r4);


        assertEquals(r3.getPV(),0);

    }
}