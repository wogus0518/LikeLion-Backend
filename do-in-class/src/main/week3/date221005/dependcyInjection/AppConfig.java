package main.week3.date221005.dependcyInjection;

import main.week3.date221005.dependcyInjection.repository.MemoryMemberRepository;
import main.week3.date221005.dependcyInjection.service.MemberService;
import main.week3.date221005.dependcyInjection.service.MemberServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
}
