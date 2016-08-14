package example.gege.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import example.gege.bean.UserBean;
@Controller 
@RequestMapping
public class AppLogin {
	@RequestMapping(value = "/LoginServlet")
	 @ResponseBody
	public Object login(UserBean bean) {
		 //�����������ͣ�map�Զ�ת����json����Ҫ���� <mvc:annotation-driven>�������ƶ�ת�����ߣ������jar����
		 Map map = new HashMap();
		 if(bean.getUser_name()==null||bean.getUser_password()==null
				 ||bean.getUser_name().isEmpty()||bean.getUser_password().isEmpty()){
			 map.put("msg", "�Ƿ�����");
			 map.put("result", 0);
		 }else if(bean.getUser_name().equals("714276725")&&bean.getUser_password().equals("6910502")){
			 map.put("msg", "sucess");
			 map.put("result", 1);
		 }else{
			 map.put("msg", "�˻������������");
			 map.put("result", 0);
		 }
		 return map;
	}

}
