package stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import stock.mapper.StockMapper;
import stock.pojo.Stock;
import stock.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    StockService stockService;

    @RequestMapping("/add")
    public String stockRemove() {
        return ""+serverPort;
    }

    @RequestMapping("/getStock")
    @ResponseBody
    public Stock getStock(Integer id) {
        return stockService.getStock(id);
    }
}
