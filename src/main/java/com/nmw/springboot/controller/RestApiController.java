package com.nmw.springboot.controller;

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

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	Services services;

	@RequestMapping(value = "/add/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@Valid @RequestBody Root root) {
		logger.info("JSON Object : {}", root);

		BigDecimal addition = services.addition(new BigDecimal(root.getGlobal().getAddition().getFirstNum()),
												new BigDecimal(root.getGlobal().getAddition().getSecondNum()));

		return new ResponseEntity<>(addition.toString(), HttpStatus.OK);
	}

}