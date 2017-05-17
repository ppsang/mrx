package space.mrx.basic.manager;

import space.mrx.basic.common.vo.ResultVO;
import space.mrx.basic.dao.dataobject.UserDO;

public interface IUserManager {

	/**
	 * 用户登录
	 * @param userDO
	 * @return
	 */
	ResultVO login(UserDO userDO);
	// @FIXME 引入logger4j
	

}
