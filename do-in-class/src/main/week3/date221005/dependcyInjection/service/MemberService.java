package main.week3.date221005.dependcyInjection.service;

import main.week3.date221005.dependcyInjection.domain.member.Member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
