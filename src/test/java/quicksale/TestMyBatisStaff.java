package quicksale;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ygmy.quicksale.pojo.StaffEntity;
import com.ygmy.quicksale.service.StaffService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatisStaff {
	private static Logger logger = Logger.getLogger(TestMyBatisStaff.class);
	@Resource
	private StaffService staffService = null;

	@Test
	public void test1() {
		StaffEntity staff = staffService.getStaffById(1);
		System.out.println(staff.getFirstName());
		logger.info(JSON.toJSONString(staff));
	}
}
