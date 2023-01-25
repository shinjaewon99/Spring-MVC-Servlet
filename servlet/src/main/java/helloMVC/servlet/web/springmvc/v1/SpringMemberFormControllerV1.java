package helloMVC.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 내부에 @Component가 있어 컴포넌트 스캔의 대상이된다.
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        // 뷰 리졸버에서 jsp를 처리하기위한 view가 render가 된다.
        return new ModelAndView("new-form");
    }
}
