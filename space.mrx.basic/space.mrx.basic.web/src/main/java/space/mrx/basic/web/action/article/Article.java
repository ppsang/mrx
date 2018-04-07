package space.mrx.basic.web.action.article;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Article {

    @RequestMapping("/article")
    public String visit(HttpServletRequest request, ModelAndView modelAndView){
        
//        request
        
        
//        
        request.setAttribute("xxx", StringUtils.class);
        return "article/article";
        
    }
}
