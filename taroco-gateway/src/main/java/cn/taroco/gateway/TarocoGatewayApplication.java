package cn.taroco.gateway;

import cn.taroco.oauth2.config.annotation.EnableResJwtTokenStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * zuul gateway
 *
 * @author liuht
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableResJwtTokenStore
public class TarocoGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarocoGatewayApplication.class, args);
	}
}
