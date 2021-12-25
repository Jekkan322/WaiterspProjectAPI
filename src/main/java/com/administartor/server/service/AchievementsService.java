package com.administartor.server.service;

import com.administartor.server.model.Waiters;
import com.administartor.server.repositories.AchievementsRepository;
import com.administartor.server.repositories.WaitersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchievementsService {
    @Autowired
    AchievementsRepository achievementsRepository;

    @Autowired
    WaitersRepository waitersRepository;


}
