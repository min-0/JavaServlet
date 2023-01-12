package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        //log.trace("trace log" + name) //이렇게 사용X 의미없는 + 연산으로 인해 리소스 낭비
        log.trace(" trace log={} ", name);
        log.debug(" debug log={} ", name); //디버그 로그
        log.info(" info log={} ", name); //비즈니스 등 정보 로그
        log.warn(" warn log = {} ", name); //위험하다
        log.error(" error log={} ", name); //에러

        return "OK";
    }
}
