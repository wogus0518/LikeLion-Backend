package week3.date221005.dependcyInjection;

import week3.date221005.dependcyInjection.repository.MemoryMemberRepository;
import week3.date221005.dependcyInjection.service.MemberService;
import week3.date221005.dependcyInjection.service.MemberServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
}
