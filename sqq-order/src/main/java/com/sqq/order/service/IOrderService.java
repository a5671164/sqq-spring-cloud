package com.sqq.order.service;

import com.sqq.order.vo.NewOrder;

public interface IOrderService {

    void saveOrder(NewOrder newOrder) throws Exception;

}
