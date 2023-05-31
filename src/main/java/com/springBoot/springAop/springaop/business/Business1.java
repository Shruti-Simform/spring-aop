package com.springBoot.springAop.springaop.business;

import com.springBoot.springAop.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    Dao1 dao1;

    public String calculateDao1() {
        return dao1.retrieveDao();
    }
}
