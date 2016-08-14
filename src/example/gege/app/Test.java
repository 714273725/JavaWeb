package example.gege.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//��һ���������������ַӳ���ע�⣬��������򷽷��ϡ��������ϣ���ʾ���е�������Ӧ����ķ��������Ըõ�ַ��Ϊ��·��
@RequestMapping("test")
public class Test {
	@RequestMapping(value = "/hello.json", method = RequestMethod.GET)
	 // ��ע�����ڶ�ȡRequest�����body�������ݣ�ʹ��ϵͳĬ�����õ�HttpMessageConverter���н�����Ȼ�����Ӧ�����ݰ󶨵�Ҫ���صĶ����ϣ�
	 @ResponseBody
	 // ��ô����Ҫ���ʴ˷����� ����·��Ӧ����http://ip��ַ:�˿�/SpringMVC/HelloController/hello.json
	 public Object hello() {
		return "Hello SpringMVC!";
	 }
}
