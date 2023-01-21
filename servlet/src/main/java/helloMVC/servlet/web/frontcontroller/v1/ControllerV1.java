package helloMVC.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {

    // 인터페이스로 만들어 줌으로써 다형성, MVC 패턴에서는 HttpServlet을 각각 호출한뒤 사용했어야됐음.
    // 인터페이스를 호출해서 사용함으로, 로직의 일관성을 가져갈수있다.

    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
