package example.core;

import example.core.discount.DiscountPolicy;
import example.core.discount.FixDiscountPolicy;
import example.core.discount.RateDiscountPolicy;
import example.core.member.*;
import example.core.order.OrderService;
import example.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() { return new OrderServiceImpl(memberRepository(), DiscountPolicy()); }
    @Bean
    public DiscountPolicy DiscountPolicy() { return new RateDiscountPolicy(); }
}
