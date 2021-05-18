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
    Job test_job5 = new Job();

    @Before
    public void createJobObject1(){
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Before
    public void createJobObject2(){
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Before
    public void createJobObject5(){
        test_job5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
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

    @Test
    public void testToStringMethod (){
        assertTrue(test_job5.toString().substring(0, 2).isBlank());
        assertTrue(test_job5.toString().substring(test_job5.toString().length() - 2, test_job5.toString().length()).isBlank());
    }

    @Test
    public void testToStringMethod2(){
        assertEquals(test_job4.toString(), "     \n" + "ID: " + test_job4.getId() +
                "\n" + "Name: " + test_job4.getName() +
                "\n" + "Employer: " + test_job4.getEmployer() +
                "\n" + "Location: " + test_job4.getLocation() +
                "\n" + "Position Type: " + test_job4.getPositionType() +
                "\n" + "Core Competency: " + test_job4.getCoreCompetency() +
                "\n             ");
    }

    @Test
    public void testToStringMethod3(){
        assertTrue(test_job5.getName().equals("Data not available"));
        assertTrue(test_job5.getEmployer().equals("Data not available"));
        assertTrue(test_job5.getLocation().equals("Data not available"));
        assertTrue(test_job5.getPositionType().equals("Data not available"));
        assertTrue(test_job5.getCoreCompetency().equals("Data not available"));
    }
}
