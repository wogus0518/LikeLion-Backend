package main.week3.date221005.dependcyInjection;

import main.week3.date221005.dependcyInjection.domain.member.Grade;
import main.week3.date221005.dependcyInjection.domain.member.Member;
import main.week3.date221005.dependcyInjection.service.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
    }
}
