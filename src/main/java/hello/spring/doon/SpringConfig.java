package hello.spring.doon;

import hello.spring.doon.aop.TimeTraceAop;
import hello.spring.doon.repository.MemberRepository;
import hello.spring.doon.repository.MemoryMemberRepository;
import hello.spring.doon.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository; // Spring Data JPA

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

//    private EntityManager em; // JPA

//    @Autowired
//    public SpringConfig(MemberRepository memberRepository, EntityManager em) {
//        this.memberRepository = memberRepository;
//        this.em = em;
//    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
//        return new JpaMemberRepository(em);
    }
}
