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
        test_job5 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
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
    public void testToStringMethodStartsAndEndsWithNewLine (){
        char firstChar = test_job5.toString().charAt(0);
        String firstString = String.valueOf(firstChar);
        char lastChar = test_job5.toString().charAt((test_job5.toString().length() - 1));
        String lastString = String.valueOf(lastChar);
        assertEquals(firstString, "\n");
        assertEquals(lastString, "\n");
    }

    @Test
    public void testToStringMethod2(){
        String output = String.format("\nID: %d\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: %s\n" +
                "Position Type: %s\n" +
                "Core Competency: %s\n", test_job4.getId(), test_job4.getName(), test_job4.getEmployer(), test_job4.getLocation(), test_job4.getPositionType(), test_job4.getCoreCompetency());
        assertEquals(output, test_job4.toString());
    }

    @Test
    public void testToStringMethod3(){
        test_job5.getEmployer().setValue("");
        test_job5.getPositionType().setValue("");
        String output = String.format("\nID: %d\n" +
                "Name: %s\n" +
                "Employer: Data not available\n" +
                "Location: %s\n" +
                "Position Type: Data not available\n" +
                "Core Competency: %s\n",test_job5.getId(), test_job5.getName(), test_job5.getLocation(), test_job5.getCoreCompetency());
        assertEquals(output, test_job5.toString());
    }
}
