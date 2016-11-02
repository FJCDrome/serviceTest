package com.test;

import com.alibaba.fastjson.JSON;
import com.model.ShopDO;
import com.service.ShopService;
import com.utils.SpringBeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by drome on 16/11/1.
 */
public class BipApiServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");//jetty中文乱码
        ShopService shopService=SpringBeanUtils.getBean(ShopService.class);
        ShopDO shopDO=shopService.findOne();
        String s= JSON.toJSONString(shopDO);
        resp.getOutputStream().write(s.getBytes());
        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }


}
