package helloMVC.servlet.web.frontcontroller.v2;

import helloMVC.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {
    // MyView로 반환 함으로써 클래스마다 viewPath, foward를 매핑 안해도 된다.
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
