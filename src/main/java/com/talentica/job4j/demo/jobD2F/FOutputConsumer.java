package com.talentica.job4j.demo.jobD2F;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.OutputConsumer;
import com.talentica.job4j.demo.model.F;

public class FOutputConsumer implements OutputConsumer<F>{
	private static final Logger logger = LoggerFactory.getLogger(FOutputConsumer.class);
	public void consumeOutput(F output, int counter) {
		logger.debug("Consuming F >> "+output);
	}

}
