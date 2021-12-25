package com.administartor.server.model;

import com.administartor.server.entities.AchievementsEntity;

public class Achievements {

    private String nameAchievement;
    private String descriptionAchievement;
    private int requiredAmount;

    public static Achievements toModel(AchievementsEntity achievementsEntity){
        Achievements achievements = new Achievements();
        achievements.setNameAchievement(achievementsEntity.getNameAchievement());
        achievements.setDescriptionAchievement(achievementsEntity.getNameAchievement());
        achievements.setRequiredAmount(achievementsEntity.getRequiredAmount());
        return  achievements;
    }
    public Achievements(){

    }

    public String getNameAchievement() {
        return nameAchievement;
    }

    public void setNameAchievement(String nameAchievement) {
        this.nameAchievement = nameAchievement;
    }

    public String getDescriptionAchievement() {
        return descriptionAchievement;
    }

    public void setDescriptionAchievement(String descriptionAchievement) {
        this.descriptionAchievement = descriptionAchievement;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
}
