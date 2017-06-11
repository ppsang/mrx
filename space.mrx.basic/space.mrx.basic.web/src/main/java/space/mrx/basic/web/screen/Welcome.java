package space.mrx.basic.web.screen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@RequestMapping("/index")
	// @ResponseBody // 直接输出到屏幕上面
	public String wlecome(HttpServletRequest request, HttpServletResponse response, Model model){
		
		// 这儿返回的东西，会自动加上前缀和后缀进行匹配 会自动进行跳转
		return "index";
	}
	
}
