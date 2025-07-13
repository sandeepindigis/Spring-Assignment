package org.example.springboot_intercepter_app.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RequestLogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       System.out.println("preHandler() method is called");
       long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
       String clientId=request.getParameter("clientId");

       if("ashokIt".equals(clientId)){
           return true;
       }
       response.getWriter().print("Invalid Request");

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandler() method is called");
        long endTime = System.currentTimeMillis();
        long startTime= request.getAttribute("startTime")==null?0:(Long)request.getAttribute("startTime");

        long time=endTime-startTime;

        System.out.println("Total time taken : "+time);

        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
