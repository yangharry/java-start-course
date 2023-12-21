package hello.hellospring;

import javax.sql.DataSource;
import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.domain.Member;
// import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.JdbsTemplateMemberRepository;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
// import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import jakarta.persistence.EntityManager;

@Configuration
public class SpringConfig {

    // private DataSource dataSource;

    // public SpringConfig(DataSource dataSource) {
    // this.dataSource = dataSource;
    // }

    // private EntityManager em;

    // @Autowired
    // public SpringConfig(EntityManager em) {
    // this.em = em;
    // }

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // @Bean
    // public MemberService memberService() {
    // return new MemberService(memberRepository());
    // }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    // @Bean
    // public MemberRepository memberRepository() {
    // return new MemoryMemberRepository();
    // return new JdbcMemberRepository(dataSource);
    // return new JdbsTemplateMemberRepository(dataSource);
    // return new JpaMemberRepository(em);
    // }

    // @Bean
    // public TimeTraceAop timeTraceAop() {
    // return new TimeTraceAop();
    // }
}
