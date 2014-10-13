package com.talentica.job4j.demo.jobC2D;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.OutputConsumer;
import com.talentica.job4j.demo.model.D;

public class DOutputConsumer implements OutputConsumer<D>{
	private static final Logger logger = LoggerFactory.getLogger(DOutputConsumer.class);
	public void consumeOutput(D output, int counter) {
		logger.debug("Consuming D >> "+output);
	}

}
