package com.vingo.deviceparser.message.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vingo.deviceparser.common.api.BaseApi;
import com.vingo.deviceparser.message.api.request.GetAllMessageRequest;


@RequestMapping(path= "/messages", produces=MediaType.APPLICATION_JSON_VALUE)
public interface MessageApi extends BaseApi {
	
	@GetMapping("/")
	public ResponseEntity<GetAllMessageRequest> getAllMessage();
}
