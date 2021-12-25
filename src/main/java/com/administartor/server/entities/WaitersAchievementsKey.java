package com.administartor.server.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class WaitersAchievementsKey implements Serializable {

    @Column(name="waiters_id")
    Long waitersId;

    @Column(name="achievements_id")
    Long achievementsId;
}
