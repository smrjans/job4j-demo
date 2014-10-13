package com.talentica.job4j.demo.jobA2B;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.OutputConsumer;
import com.talentica.job4j.demo.model.B;

public class BOutputConsumer implements OutputConsumer<B>{
	private static final Logger logger = LoggerFactory.getLogger(BOutputConsumer.class);
	public void consumeOutput(B output, int counter) {
		logger.debug("Consuming B >> "+output);
	}

}
