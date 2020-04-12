package anyu.springbootexception.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 统一异常处理2，实现HandlerExceptionResoller
 */
@Configuration
public class GlobalExveption3 implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
       ModelAndView mv=new ModelAndView();
       if (e instanceof NullPointerException)
           mv.setViewName("error1");
       if (e instanceof ArithmeticException)
           mv.setViewName("error2");
       mv.addObject("error",e.toString());
        return mv;
    }
}

