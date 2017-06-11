package space.mrx.basic.web.action.article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Article {

    @RequestMapping("/article")
    public String visit(){
        
        
        return "article/article";
        
    }
}
