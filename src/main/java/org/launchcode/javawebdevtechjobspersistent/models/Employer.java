package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name="employer_id")
    private static List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Location is required.")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters.")
    private String location;

    public Employer() {
    }

    public Employer(String location, ArrayList jobs) {
        super();
        this.location = location;
        this.jobs = jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static List<Job> getJobs() {
        return jobs;
    }

    public static void setJobs(List<Job> jobs) {
        Employer.jobs = jobs;
    }
}
