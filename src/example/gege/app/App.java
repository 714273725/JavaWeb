package example.gege.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import example.gege.bean.UserBean;
@Controller 
@RequestMapping(value = "app")  
public class App {
	 @RequestMapping(value = "/user/login")
	 @ResponseBody
	public Object login(UserBean bean) {
		 //不能声明泛型，map自动转换成json，需要先在 <mvc:annotation-driven>声明并制定转化工具，并添加jar依赖
		 Map map = new HashMap();
		 if(bean.getUser_name()==null||bean.getUser_password()==null
				 ||bean.getUser_name().isEmpty()||bean.getUser_password().isEmpty()){
			 map.put("msg", "非法参数");
			 map.put("result", 0);
		 }else if(bean.getUser_name().equals("714276725")&&bean.getUser_password().equals("6910502")){
			 map.put("msg", "sucess");
			 map.put("result", 1);
		 }else{
			 map.put("msg", "账户名或密码错误");
			 map.put("result", 0);
		 }
		 return map;
	}
	 
	 @RequestMapping(value = "/login.html")
	 @ResponseBody
	public Object login() {
		 Map map = new HashMap();
		map.put("msg", "我就让你嘿嘿嘿");
		map.put("result", 0);
		 return "我就让你嘿嘿嘿";
	}
}
