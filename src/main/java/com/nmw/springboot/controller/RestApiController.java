package com.nmw.springboot.controller;

import com.nmw.springboot.config.BillerConfig;
import com.nmw.springboot.model.Root;
import com.nmw.springboot.service.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	Services services;

	@Autowired
	BillerConfig billerConfig;

	@RequestMapping(value = "/single/", method = RequestMethod.POST)
	public ResponseEntity<?> readJsonObject(@Valid @RequestBody Root root) {
		logger.info("JSON Object : {}", root);

		BigDecimal addition = services.addition(new BigDecimal(root.getGlobal().getAddition().getFirstNum()),
												new BigDecimal(root.getGlobal().getAddition().getSecondNum()));

		return new ResponseEntity<>(addition.toString(), HttpStatus.OK);
	}

	@RequestMapping(value = "/tuple/", method = RequestMethod.POST)
	public ResponseEntity<?> readJsonTuple(@Valid @RequestBody Collection<Root> rootTuple) {
		logger.info("JSON Object Array : {}", rootTuple);
		BigDecimal addition = BigDecimal.ZERO ;
		for(Root root: rootTuple){
			//TODO write business logic
			addition = addition.add(services.addition(new BigDecimal(root.getGlobal().getAddition().getFirstNum()),
					new BigDecimal(root.getGlobal().getAddition().getSecondNum())));
		}

		return new ResponseEntity<>(addition.toString(), HttpStatus.OK);
	}

	@RequestMapping(value = "/config", method = RequestMethod.GET)
	public ResponseEntity<?> readConfig() {
		Map<Integer, String> map = new HashMap<>();
		System.out.println(billerConfig.getDatasource());
		List<Integer> list = Arrays.asList(11,22,33);
		for(int i=1;i<list.size();i++){
			map.put(list.get(i), billerConfig.getDatasource().get(i));
		}
		System.out.println(map);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}


}