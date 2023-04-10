package order.controller;

import order.feign.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockService stockService;

    @RequestMapping("/add")
    public String orderAdd() {
        String str = stockService.stockRemove();
        return "hello " + str;
    }
}
