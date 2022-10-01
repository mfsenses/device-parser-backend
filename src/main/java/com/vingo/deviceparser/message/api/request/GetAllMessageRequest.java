package com.vingo.deviceparser.message.api.request;

import java.util.List;

import com.vingo.deviceparser.common.api.request.BaseRequest;
import com.vingo.deviceparser.message.api.output.MessageOutput;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllMessageRequest extends BaseRequest {
	private List<MessageOutput> messages;
}
