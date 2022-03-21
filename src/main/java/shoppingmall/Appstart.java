package shoppingmall;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //jpa가 엔티티의 변화 감지
@SpringBootApplication // 스프링 부트 사용 주입
public class Appstart {
    public static void main(String[] args) {
        SpringBootApplication.run(Appstart.class,args);
    }
}
