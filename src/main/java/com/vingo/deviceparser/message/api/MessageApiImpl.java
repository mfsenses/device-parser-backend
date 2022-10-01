package com.vingo.deviceparser.message.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.vingo.deviceparser.message.api.output.MessageOutput;
import com.vingo.deviceparser.message.api.request.GetAllMessageRequest;
import com.vingo.deviceparser.message.dto.MessageDTO;
import com.vingo.deviceparser.message.mapper.MessageMapper;
import com.vingo.deviceparser.message.service.MessageService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MessageApiImpl implements MessageApi {
	private final MessageService service;
	private final MessageMapper mapper;

	@Override
	public ResponseEntity<GetAllMessageRequest> getAllMessage() {
		List<MessageDTO> messages = service.getAllMessage();
		List<MessageOutput> messageOutputs = mapper.toDTOListOutput(messages);
		return ResponseEntity.ok(new GetAllMessageRequest(messageOutputs));
	}

}
