package com.mmall.controller.portal;

import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.dao.DateTestMapper;
import com.mmall.pojo.DateTest;
import com.mmall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/cart/")
public class CartTestController {
    @Autowired
    private DateTestMapper dateTestMapper;

    @RequestMapping("add1.do")
    @ResponseBody
    public ServerResponse add(HttpSession session) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
        }
        DateTest dateTest=new DateTest();
//        dateTest.settDateTime(LocalDateTime.now());
        int rowCount=dateTestMapper.insert(dateTest);
        if (rowCount>0){
            return ServerResponse.createBySuccessMessage("插入LocalDateTime成功");
        }
        return ServerResponse.createByErrorMessage("插入LocalDateTime失败");
    }
}
