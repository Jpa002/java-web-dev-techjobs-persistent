package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public Skill (){}

    public String getDescription(){ return description;}

    public void setDescription(String description){this.description = description;}

    @NotBlank
    @Size(min = 2, max = 250)
    private String description;

    //part 4
    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs =new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }
}