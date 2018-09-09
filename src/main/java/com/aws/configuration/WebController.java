package com.aws.configuration;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WebController {

	@RequestMapping(value = "/getData")
	public ResponseEntity<AwsDataBean> welcome() {
		AwsDataBean bean = new AwsDataBean();
		bean.setBookName("AWS");
		bean.setTopicName("S3 Bucket");
		return new ResponseEntity<AwsDataBean>(bean,HttpStatus.OK);
	}

}
