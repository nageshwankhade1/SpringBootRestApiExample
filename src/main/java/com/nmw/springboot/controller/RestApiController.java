package com.nmw.springboot.controller;

import com.nmw.springboot.model.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);


	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@Valid @RequestBody Root root) {
		logger.info("Creating Root : {}", root);

		Long sum= root.getGlobal().getAddition().getFirstNum()+root.getGlobal().getAddition().getSecondNum();
		return new ResponseEntity<String>(sum.toString(), HttpStatus.OK);
	}



}