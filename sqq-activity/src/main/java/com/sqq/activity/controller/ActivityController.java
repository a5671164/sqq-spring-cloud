package com.sqq.activity.controller;

import com.sqq.activity.model.Activity;
import com.sqq.activity.service.IActivityService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by WIN10 on 2020/6/1.
 */
@Slf4j
@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private IActivityService activityService;

    @PutMapping("/saveActivity")
    public void saveActivity(@RequestBody Activity activity){
        log.info("--------------------新增活动{}",activity.toString());
        activityService.addActivity(activity);
        log.info("--------------------新增活动成功");
    }

    @GetMapping("getActById/{actId}")
    public Activity getActivityById(@PathVariable("actId")Integer actId){
        return activityService.findModelById(actId);
    }
}


