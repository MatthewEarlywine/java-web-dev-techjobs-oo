package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private String noData = "Data not available";

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    @Override
    public String toString(){
        String jobOutput =  "     \n" + "ID: " + this.getId() +
                "\n" + "Name: " + this.getName() +
                "\n" + "Employer: " + this.getEmployer() +
                "\n" + "Location: " + this.getLocation() +
                "\n" + "Position Type: " + this.getPositionType() +
                "\n" + "Core Competency: " + this.getCoreCompetency() +
                "\n             ";

        return jobOutput;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public String getName() {
        if(name.isBlank() || name==null){
            name = noData;
            return name;
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getEmployer() {
        if(employer.getValue().isBlank() || employer.getValue()==null){
            String val = employer.getValue();
            val = noData;
            return val;
        } else {
            return employer;
        }
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Object getLocation() {
        if(location.getValue().isBlank() || location.getValue()==null){
            String val = location.getValue();
            val = noData;
            return val;
        } else {
            return location;
        }
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Object getPositionType() {
        if(positionType.getValue().isBlank() || positionType.getValue() == null){
            String val = positionType.getValue();
            val = noData;
            return val;
        } else {
            return positionType;
        }
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public Object getCoreCompetency() {
        if(coreCompetency.getValue().isBlank() || coreCompetency.getValue()==null){
            String val = coreCompetency.getValue();
            val = noData;
            return val;
        } else {
            return coreCompetency;
        }
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
