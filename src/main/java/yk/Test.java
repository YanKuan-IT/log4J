package yk;

import org.apache.log4j.Logger;

public class Test {

	//��ȡloggerʵ��
	private static Logger logger = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		logger.info("��ͨinfo��Ϣ");
		logger.debug("����debug��Ϣ");
		logger.error("����error��Ϣ");
		logger.warn("����warn��Ϣ");
		logger.fatal("���ش���fatal��Ϣ");
		
		logger.error("������Ϣ", new IllegalArgumentException("���Ϸ�����ȷ�Ĳ���"));
	}
}
