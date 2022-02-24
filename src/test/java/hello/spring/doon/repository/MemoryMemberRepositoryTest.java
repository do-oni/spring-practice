package hello.spring.doon.repository;

import hello.spring.doon.domain.Member;
import hello.spring.doon.repository.MemberRepository;
import hello.spring.doon.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

// TDD 방법 : Test 클래스를 먼저 작성하고 Repository를 만드는 방법
// Test가 여러개 일 때 상위 Test 패키지에서 run
public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("doon");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
//        System.out.println(result == member); // true
//        Assertions.assertEquals(member, null);
        assertThat(member).isEqualTo(result); // assertj : 좀 더 편하게 사용
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("dooni1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("dooni2");
        repository.save(member2);

        Member result = repository.findByName("dooni1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("dooni1");
        repository.save(member1);

        Member member2 = new Member();
        member1.setName("dooni2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);

    }

}
