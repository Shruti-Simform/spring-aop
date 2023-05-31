package com.springBoot.springAop.springaop.business;

import com.springBoot.springAop.springaop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    Dao2 dao2;

    public String calculateDao2() {
        return dao2.retrieveDao();
    }
}
