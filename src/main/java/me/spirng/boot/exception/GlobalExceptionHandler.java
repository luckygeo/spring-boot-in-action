package me.spirng.boot.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(HttpException.class)
    
    @ResponseBody
    public String exceptionHandler(HttpServletRequest request, HttpException exception) throws Exception {
        Map map = new HashMap();
        map.put("msg", exception.getMessage());
        map.put("code", 500);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(map);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionHandler1(HttpServletRequest request, Exception exception) throws Exception {
        Map map = new HashMap();
        map.put("msg", exception.getMessage());
        map.put("code", 501);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(map);
    }

}
