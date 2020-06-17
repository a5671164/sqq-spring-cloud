package com.sqq.activity.service;

import com.sqq.activity.model.Activity;

public interface IActivityService {

    // 添加活动
    void addActivity(Activity activity);

    // 查询活动
    Activity findModelById(Integer id);
}
