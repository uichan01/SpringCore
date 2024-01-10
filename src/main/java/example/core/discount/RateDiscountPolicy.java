package example.core.discount;

import example.core.annotation.MainDiscountPolicy;
import example.core.member.Grade;
import example.core.member.Member;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPersent = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
            return price * discountPersent/100;
        else
            return 0;

    }
}
