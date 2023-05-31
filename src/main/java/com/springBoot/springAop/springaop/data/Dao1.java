package com.springBoot.springAop.springaop.data;

import com.springBoot.springAop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    @TrackTime
    public String retrieveDao(){
        return "Dao1";
    }
}
