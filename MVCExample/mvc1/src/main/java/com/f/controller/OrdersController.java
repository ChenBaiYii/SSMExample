package com.f.controller;


import com.f.pojo.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @RequestMapping("addOrder")
    // 这里的String返回值类型就是返回的视图的名称
    public String addOrders(Model model) {
        List<Orders> list = new ArrayList<>();
        Orders o = new Orders();
        o.setId("1");
        o.setName("lily");
        o.setTotal(33.3);

        Orders o2 = new Orders();
        o2.setId("2");
        o2.setName("lily2");
        o2.setTotal(22.2);

        list.add(o);
        list.add(o2);

        model.addAttribute("orders", list);

        return "orders";
    }

}
