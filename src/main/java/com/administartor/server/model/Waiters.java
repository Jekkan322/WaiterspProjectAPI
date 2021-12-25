package com.administartor.server.model;

import com.administartor.server.entities.WaitersEntity;

public class Waiters {
    private Long id;

    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;

    private String position;
    private Long rating;

    public static Waiters toModel(WaitersEntity waitersEntity){
        Waiters model=new Waiters();
        model.setId(waitersEntity.getId());
        model.setFirstName(waitersEntity.getFirstName());
        model.setLastName(waitersEntity.getLastName());
        model.setMiddleName(waitersEntity.getMiddleName());
        model.setFullName(waitersEntity.getLastName()+ " " + waitersEntity.getFirstName()+ " " + waitersEntity.getMiddleName());
        model.setPosition(waitersEntity.getPosition());
        model.setRating(waitersEntity.getRating());
        return model;
    }

    public Waiters() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }
}
