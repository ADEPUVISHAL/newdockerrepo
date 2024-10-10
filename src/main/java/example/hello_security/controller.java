package example.hello_security;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class controller {
    @GetMapping("/")
    public String getMethodName() {
        return "welcome to new world";
    }

    @GetMapping("/seesionid")
    public String getMethodName(HttpServletRequest requests) {
        return "hello" + requests.getSession().getId();
    }

    @GetMapping("/csrf")
    public CsrfToken generateCsrfToken(HttpServletRequest requests) {
        return (CsrfToken) requests.getAttribute("_csrf");
    }

}
