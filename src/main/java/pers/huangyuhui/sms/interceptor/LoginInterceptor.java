package pers.huangyuhui.sms.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginInterceptor
 * @Description TODO
 * @Author lxy
 * @Date 2020/7/9
 * @Since 1.8
 * @Version 1.0
 */
public class LoginInterceptor implements HandlerInterceptor {

    //该方法会在控制器方法前执行,其返回值表示是否中断后续操作
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取请求的url
        String url = request.getRequestURI();

        if(url.indexOf("login")>0||url.indexOf("system/login")>0){
            return true;
        }
        //判断用户是否已登录
        if (request.getSession().getAttribute("userInfo") != null) {
            return true;
        }
        //用户未登录,拦击其请求并将其转发到用户登录页面
        request.getRequestDispatcher("/login").forward(request, response);
        System.out.println("拦截了....");
        return false;
    }

    //该方法会在控制器方法调用之后,且解析视图之前调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    //该方法会在整个请求完成,既视图渲染结束之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
