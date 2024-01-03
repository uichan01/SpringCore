package example.core.member;

public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository;

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}



