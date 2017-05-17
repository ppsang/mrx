package space.mrx.basic.service;

import space.mrx.basic.common.vo.ResultVO;
import space.mrx.basic.dao.dataobject.UserDO;

/**
 * <b>用户相关的模块
 * @author chen
 * @version 1.0
 */
public interface IUserService {

	// 用户登录的功能
	ResultVO Login(UserDO userDO);

}
