package com.administartor.server.repositories;

import com.administartor.server.entities.AchievementsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementsRepository extends CrudRepository<AchievementsEntity,Long> {

}
