package space.mrx.basic.web.screen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@RequestMapping("/welcome/{param}")
	public String wlecome(@PathVariable String param, HttpServletRequest request, HttpServletResponse response, Model model){
		
		// model.addAttribute("afa","1");
		System.out.println("传递进来的参数是：" + param);
		
		// 这儿返回的东西，会自动加上前缀和后缀进行匹配 会自动进行跳转
		return "index";
	}
}
