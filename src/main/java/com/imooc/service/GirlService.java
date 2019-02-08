package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by 廖师兄
 * 2016-11-04 00:08
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

//    // 事务一致性测试
//    @Transactional
//    public void insertTwo() {
//        Girl girlA = new Girl();
//        girlA.setCupSize("A");
//        girlA.setAge(18);
//        girlRepository.save(girlA);
//
//
//        Girl girlB = new Girl();
//        girlB.setCupSize("B");
//        girlB.setAge(19);
//        girlRepository.save(girlB);
//    }

    public void getAge(Integer id){
        Girl girl = girlRepository.findById(id).get();
        Integer age = girl.getAge();

        if (age <= 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }

        if (age < 16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOLL);
        }
    }

    public Girl getById(Integer id) {
        return girlRepository.findById(id).get();
    }
}
