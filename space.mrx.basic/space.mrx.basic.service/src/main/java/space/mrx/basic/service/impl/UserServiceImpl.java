package space.mrx.basic.service.impl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import space.mrx.basic.common.vo.ResultVO;
import space.mrx.basic.dao.dataobject.UserDO;
import space.mrx.basic.manager.IUserManager;
import space.mrx.basic.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserManager userManager;
	
	// @FIXME 需要引入logger4J
	Logger logger = Logger.getLogger(UserServiceImpl.class.toString());

	public ResultVO Login(UserDO userDO) {
		
		return userManager.login(userDO);
	}
	
	
}
