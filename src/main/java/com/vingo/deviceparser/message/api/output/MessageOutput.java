package com.vingo.deviceparser.message.api.output;

import java.util.Date;

import com.vingo.deviceparser.common.api.output.BaseOutput;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageOutput extends BaseOutput {
	private String id;
	private String message;
	private Date createdDate;
}
