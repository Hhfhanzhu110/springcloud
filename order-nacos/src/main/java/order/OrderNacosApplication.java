package order;

import ribbon.RibbonRandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@RibbonClients({
        @RibbonClient(name = "stock-server",configuration = RibbonRandomRuleConfig.class)
})
public class OrderNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication.class, args);
    }
}
