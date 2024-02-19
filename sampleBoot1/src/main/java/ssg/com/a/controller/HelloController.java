package ssg.com.a.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ssg.com.a.dto.HumanDto;

// @Controller
// @Component	<- 	자동생성
@RestController		//	@Controller + @ResponseBody	-> Restful
public class HelloController {

	/*
	 * @ResponseBody
	 * @GetMapping("idcheck") public String idcheck(String id) { return "YES"; }
	 */

	 @GetMapping("idcheck")
	 public String idcheck(String id) { return "예"; }

	 @GetMapping("/")
	 public String hello() {
		 System.out.println("HelloController hello()" + new Date());
		 
		 return "안녕하세요";
	 }
	 
	 @GetMapping("test")
	 public int test() {
		 System.out.println("HelloController test()" + new Date());

		 return 1024;
	 }
	 
	 @GetMapping("human")
	 public HumanDto human() {
		System.out.println("HelloController human()" + new Date());
		
		HumanDto dto = new HumanDto("aaa", "홍길동", 172.1);
		
	 	return dto;
	 }
	 
	 @GetMapping("conn_param")
	 public String conn_param(int number, String name) {
		System.out.println("HelloController conn_param()" + new Date());
		
		System.out.println("number: " + number);
		System.out.println("name: " + name);
		
		return "success";
	 }
	 
	 @GetMapping("param_obj")
	 public String param_obj(HumanDto human) {
		System.out.println("HelloController param_obj()" + new Date());
		
		System.out.println(human.toString());
	 	return "성공";
	 }
	 
	 @GetMapping("getlist")
	 public List<HumanDto> getlist() {
		System.out.println("HelloController getlist()" + new Date());
		
		List<HumanDto> list = new ArrayList<HumanDto>();
		list.add(new HumanDto("aaa", "홍길동", 172.1));
		list.add(new HumanDto("bbb", "성춘향", 158.2));
		list.add(new HumanDto("ccc", "정수동", 182.3));
		
		return list;		
	 }
	 
	 @GetMapping("getmap")
	 public Map<String, Object> getmap() {
		System.out.println("HelloController getmap()" + new Date());
		
		String title = "나는 반드시 성공한다!";
		
		List<HumanDto> list = new ArrayList<HumanDto>();
		list.add(new HumanDto("aaa", "홍길동", 172.1));
		list.add(new HumanDto("bbb", "성춘향", 158.2));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", title);
		map.put("list", list);
		
	 	return map;
	 }
	 
	 
	 
	 
}
