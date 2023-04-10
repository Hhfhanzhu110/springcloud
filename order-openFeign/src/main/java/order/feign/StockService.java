package order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-server",path = "/stock")
public interface StockService {

    @RequestMapping("/add")
    public String stockRemove();

}
