package space.mrx.basic.web.screen;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Welcome {

	@RequestMapping("/welcome/{param}")
	// @ResponseBody // 直接输出到屏幕上面
	public String wlecome(@PathVariable String param, HttpServletRequest request, HttpServletResponse response, Model model){
		
		@SuppressWarnings("unchecked")
		Map<String, String> parameterMap = request.getParameterMap();
		System.out.println(parameterMap);
		// model.addAttribute("afa","1");
		model.addAttribute("afa", param);
		System.out.println("传递进来的参数是：" + param);
		
		// 这儿返回的东西，会自动加上前缀和后缀进行匹配 会自动进行跳转
		return "login";
	}
	
	@RequestMapping("/welcome/hello")
	public @ResponseBody String hello(HttpServletRequest request, HttpServletResponse response, Model model, ModelAndView modelAndView){
		String name = modelAndView.getViewName();
		model.addAttribute("hello", "1212");
		return "afafa";
	}
}
