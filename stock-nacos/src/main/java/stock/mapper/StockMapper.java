package stock.mapper;

import org.springframework.stereotype.Repository;
import stock.pojo.Stock;

/**
 * StockMapper继承基类
 */
@Repository
public interface StockMapper extends MyBatisBaseDao<Stock, Integer> {

}