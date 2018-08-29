package com.citigroup.spring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private List<String> lst = Arrays.asList(new String[] { "AWS", "Azure", "GCP", "Pivotal", "Cloud Foundry" });

	@RequestMapping(path = "/data", method = RequestMethod.GET)
	public List<String> getData() {
		return lst;
	}

	@RequestMapping(path = "/filter", method = RequestMethod.POST)
	public List<String> filterData(String data) {
		return lst.stream().filter(item -> {
			return !item.equalsIgnoreCase(data);
		}).collect(Collectors.toList());
	}
}
