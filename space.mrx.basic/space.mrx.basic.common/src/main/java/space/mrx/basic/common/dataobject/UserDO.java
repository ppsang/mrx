package space.mrx.basic.common.dataobject;

import java.io.Serializable;

public class UserDO implements Serializable{

	private static final long serialVersionUID = -6901385332140651700L;
	
	private Long userId;
	
	private String username;
	
	private String password;
	
	private String alias; // 用户的昵称
	
	private Integer level;
	
	private Integer coins;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getCoins() {
		return coins;
	}

	public void setCoins(Integer coins) {
		this.coins = coins;
	}
	
}
