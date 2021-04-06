package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    //part 3
    @OneToMany//(mappedBy = "employer")
    @JoinColumn
    private final List<Job> jobs =new ArrayList<>();



    public Employer (){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @NotBlank
    @Size(min=2, max = 51)
    public String location;

    public List<Job> getJobs() {
        return jobs;
    }
}
