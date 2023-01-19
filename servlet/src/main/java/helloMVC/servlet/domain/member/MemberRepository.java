package helloMVC.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *
 * 동시성 문제가 고려되지않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 * */
public class MemberRepository {

    // static으로 했기 때문에, MemberRepository가 아무리 new로 받아도 하나만 사용된다.
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    // servlet으로 만들기 때문에 Singleton 직접 선언
    private static final MemberRepository instance = new MemberRepository();


    public static MemberRepository getInstance() {
        return instance;
    }

    // Singleton을 사용하기 위해 private으로 막아준다.
    private MemberRepository() {

    }

    public Member save(Member member) {
        member.setId(sequence++);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        // private static Map<Long, Member> store = new HashMap<>(); , Member가 values 값임으로 반환
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
