package stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.mapper.StockMapper;
import stock.pojo.Stock;

@Service
public class StockService {
    @Autowired
    StockMapper stockMapper;

    public Stock getStock(int id) {
        return stockMapper.selectByPrimaryKey(id);
    }


}
