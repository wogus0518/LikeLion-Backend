package week3.date221005.dependcyInjection.repository;

import week3.date221005.dependcyInjection.domain.member.Member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
