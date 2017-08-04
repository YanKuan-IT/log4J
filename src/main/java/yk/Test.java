package yk;

import org.apache.log4j.Logger;

public class Test {

	//获取logger实例
	private static Logger logger = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		logger.info("普通info信息");
		logger.debug("调试debug信息");
		logger.error("报错error信息");
		logger.warn("警告warn信息");
		logger.fatal("严重错误fatal信息");
		
		logger.error("报错信息", new IllegalArgumentException("不合法不正确的参数"));
	}
}
