package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1 = new Job();
    Job test_job2 = new Job();
    Job test_job3;
    Job test_job4 = new Job();

    @Before
    public void createJobObject1(){
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Before
    public void createJobObject2(){
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobID(){
        assertTrue(test_job1.getId() == test_job2.getId() - 1);
        assertEquals(test_job2.getId(), test_job1.getId() + 1);
        assertFalse(test_job1.getId() >= test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(test_job3 instanceof Job);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job3.getName().toString(), "Product tester");
        assertEquals(test_job3.getEmployer().toString(), "ACME");
        assertEquals(test_job3.getLocation().toString(), "Desert");
        assertEquals(test_job3.getPositionType().toString(), "Quality control"); // check case sensitivity of code
        assertEquals(test_job3.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job3.equals(test_job4));
    }
}
