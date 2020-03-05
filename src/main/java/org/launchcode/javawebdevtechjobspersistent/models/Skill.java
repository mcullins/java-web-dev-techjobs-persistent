package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;

@Entity
public class Skill extends AbstractEntity {

    @Max(500)
    private String description;

    public Skill(){}

    public Skill(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}

