package helloMVC.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import helloMVC.servlet.basic.HelloJson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Content - Type 지정 : application/json

        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        HelloJson helloJson = new HelloJson();
        helloJson.setUsername("shin");
        helloJson.setAge(24);

        //{"username" : "shin", "age" : 24}
        // 객체를 써서 문자로 바꾸는 것.
        String result = objectMapper.writeValueAsString(helloJson);
        response.getWriter().write(result);

    }
}
