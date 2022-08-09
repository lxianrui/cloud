package com.example.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * 身份验证拦截器
 *
 * @author Jeffrey Liu
 * @date 2022/08/09
 */
@Component
public class AuthInterceptor extends AbstractGatewayFilterFactory<Object> {
    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {

            String url = exchange.getRequest().getURI().getPath();
            System.out.println(url);
            ServerHttpResponse response = exchange.getResponse();
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
            return exchange.getResponse().writeWith(
                    Mono.just(response.bufferFactory().wrap("{message:'666'}".getBytes())));
          //  return chain.filter(exchange);
        };
    }

   static class Config{

    }
}
