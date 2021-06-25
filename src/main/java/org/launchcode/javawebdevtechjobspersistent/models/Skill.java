package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required.")
    @Size(min = 3, max = 200, message = "Description must be between 3 and 200 characters.")
    private String description;

    public Skill() {
    }

    public Skill(String description) {
        super();
        this.description = description;
    }

}