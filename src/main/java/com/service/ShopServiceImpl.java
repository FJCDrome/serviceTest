package com.service;

import com.dao.ShopDAO;
import com.model.ShopDO;

/**
 * Created by drome on 16/11/1.
 */
public class ShopServiceImpl implements ShopService{
    private ShopDAO shopDAO;

    public ShopDO findOne() {
        System.out.print("aaaaaa");
        return shopDAO.selectOneByPid(10000l);
    }

    public void setShopDAO(ShopDAO shopDAO) {
        this.shopDAO = shopDAO;
    }
}
