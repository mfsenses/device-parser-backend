package com.vingo.deviceparser.message.service;

import java.util.List;

import com.vingo.deviceparser.common.service.BaseService;
import com.vingo.deviceparser.message.dto.MessageDTO;

public interface MessageService extends BaseService {
	
	public List<MessageDTO> getAllMessage();

}
