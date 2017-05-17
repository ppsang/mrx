package space.mrx.basic.web.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.JSONObject;

import space.mrx.basic.common.vo.ResultVO;
import space.mrx.basic.dao.dataobject.UserDO;
import space.mrx.basic.service.IUserService;

@Controller
public class LoginAndRegister {

	@Autowired
	private IUserService userService;
	
	// 怎么防止重复提交
	@RequestMapping("/user/login")
	public @ResponseBody String doLogin(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// 设置查询条件
		UserDO userDO = new UserDO();
		userDO.setUsername(username);
		userDO.setPassword(password);
		// 调用service
		ResultVO result = userService.Login(userDO);
		// 为什么要转换两遍？？
		model.addAttribute("test", "123");
		return JSON.json(result);
	}
}
