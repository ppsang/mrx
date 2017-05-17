package space.mrx.basic.manager.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import space.mrx.basic.common.vo.ResultVO;
import space.mrx.basic.dao.dataobject.UserDO;
import space.mrx.basic.manager.IUserManager;

@Component
public class UserManagerImpl implements IUserManager {

	/**
	 * 用户登录的模块
	 */
	public ResultVO login(UserDO userDO) {
		if (userDO != null) {
			if (StringUtils.isNotBlank(userDO.getUsername()) && StringUtils.isNotBlank(userDO.getPassword())) {
				if (("lisi").equals(userDO.getUsername()) && "123".equals(userDO.getPassword())) {
					return ResultVO.Utils.success(true, null, userDO, null);
				}
			}
		}
		return null;
	}

}
