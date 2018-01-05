package com.testweb_mvn.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testweb_mvn.util.httpcRequest;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/hello")
public class HelloService {
	private String appid = "wx3094ded752dff5a4";
	private String secret = "b0dec622561ccad70ec31a109942a5b4";
	@ResponseBody
	@RequestMapping(value = "/init")
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {

		return "asd";
	}

	// https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
	@ResponseBody
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		String code = request.getParameter("code");
		
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+code+"&grant_type=authorization_code\n";
		JSONObject jsonObject = httpcRequest.httpcRequest(url, "GET", null);
		
		return jsonObject.toString();
	}
}
