package helloMVC.servlet.basic.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import helloMVC.servlet.basic.HelloJson;
import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyJsonServlet", urlPatterns = "/request-body-json")
public class RequestBodyJsonServlet extends HttpServlet{

    // ObjectMapper 라는 스프링이 제공해주는 라이브러리를 사용해 Json 데이터를 객체로 변환한다.
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        // 파싱한(HelloJson)클래스를 넣어준다.
        HelloJson helloJson = objectMapper.readValue(messageBody, HelloJson.class);

        System.out.println("helloJson.username = " + helloJson.getUsername());
        System.out.println("helloJson.age = " + helloJson.getAge());

        response.getWriter().write("ok");
    }
}
