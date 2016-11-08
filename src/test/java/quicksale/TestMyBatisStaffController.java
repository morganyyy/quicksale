package quicksale;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.ui.Model;

import com.ygmy.quicksale.controller.StaffController;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMyBatisStaffController {
	private static Logger logger = Logger.getLogger(TestMyBatisStaffController.class);
	@Resource
	private StaffController staffController = null;

	// 模拟request,response
	private MockHttpServletRequest request;
	private MockHttpServletResponse response;

	// 执行测试方法之前初始化模拟request,response
	@Before
	public void setUp() {
		request = new MockHttpServletRequest();
		request.setCharacterEncoding("UTF-8");
		request.setParameter("id", "1");
		response = new MockHttpServletResponse();
	}

	@Test
	public void test1() {
		Model model = new Model() {

			@Override
			public Model mergeAttributes(Map<String, ?> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean containsAttribute(String arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Map<String, Object> asMap() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Model addAttribute(String arg0, Object arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Model addAttribute(Object arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Model addAllAttributes(Map<String, ?> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Model addAllAttributes(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		staffController.toIndex(request, model);
		System.out.println("------------------------------");
		System.out.println(model.toString());
		System.out.println("------------------------------");
		// logger.info(JSON.toJSONString(staff));
	}
}
