package space.mrx.basic.common.vo;

import java.io.Serializable;

/**
 * 通用的返回值
 * @author chen
 *
 */
public class ResultVO implements Serializable{

	private static final long serialVersionUID = 4367274280399827746L;

	private Boolean success; // 成功的标志
	
	private String errorMsg; // 错误信息
	
	private String errorCode; // 错误代码
	
	private Object data;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static class Utils {
		public static ResultVO success(Boolean success, String errorMsg, Object data, String errorCode){
			ResultVO result = new ResultVO();
			result.setSuccess(success);
			result.setData(data);
			result.setErrorMsg(errorMsg);
			result.setErrorCode(errorCode);
			
			return result;
		}
	}
	
}
