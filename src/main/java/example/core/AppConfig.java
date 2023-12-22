package example.core;

import example.core.discount.DiscountPolicy;
import example.core.discount.FixDiscountPolicy;
import example.core.discount.RateDiscountPolicy;
import example.core.member.*;
import example.core.order.OrderService;
import example.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(MemberRepository());
    }

    private MemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(MemberRepository(), DiscountPolicy());
    }

    private DiscountPolicy DiscountPolicy() {
        return new RateDiscountPolicy();
    }
}
