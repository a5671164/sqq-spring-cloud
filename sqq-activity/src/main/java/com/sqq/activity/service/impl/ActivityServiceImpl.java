package com.sqq.activity.service.impl;

import com.sqq.activity.mapper.ActivityMapper;
import com.sqq.activity.model.Activity;
import com.sqq.activity.service.IActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ActivityServiceImpl implements IActivityService {

    @Autowired
    private ActivityMapper activityMapper;


    @Override
    public void addActivity(Activity activity) {
        activity.setCreateTime(new Date());
        activityMapper.insert(activity);
    }

    @Override
    public Activity findModelById(Integer id) {
        return activityMapper.selectByPrimaryKey(id);
    }
}
