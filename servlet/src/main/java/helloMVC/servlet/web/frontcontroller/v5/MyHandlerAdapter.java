package helloMVC.servlet.web.frontcontroller.v5;

import helloMVC.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {
    // Object 객체로 한 이유 : 자바 최상위 객체 Object로 유연하게 매핑하기위해서
    boolean supports(Object handler);


    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
