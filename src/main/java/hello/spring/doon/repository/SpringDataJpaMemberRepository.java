//package hello.spring.doon.repository;
//
//import hello.spring.doon.domain.Member;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import javax.swing.text.html.Option;
//import java.util.Optional;
//
//public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
//
//    // JPQL select m from Member m where m.id = ?
//    @Override
//    Optional<Member> findById(Long id);
//
//    // JPQL select m from Member m where m.name = ?
//    @Override
//    Optional<Member> findByName(String name);
//
//}
