package com.gordo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		List<Topic> list = Arrays.asList(
				new Topic("spring", "Spring Framework", "SpringFrameworkDescription", 2017, false),
				new Topic("java", "Core Java", "Core Java Description", 2018, true)				
				);
		
		return list;
	}
}
