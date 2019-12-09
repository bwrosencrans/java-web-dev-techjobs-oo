package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.launchcode.techjobs_oo.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job one = new Job();
        Job two = new Job();
        assertNotEquals(one, two);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job j = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("ACME", j.getEmployer().getValue());
        assertEquals("Desert", j.getLocation().getValue());
        assertEquals("Quality control", j.getPositionType().getValue());
        assertEquals("Persistence", j.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job one = new Job( "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job two = new Job( "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(one, two);
    }

}
