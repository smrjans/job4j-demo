package com.talentica.job4j.demo.jobD2E;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.OutputConsumer;
import com.talentica.job4j.demo.model.E;

public class EOutputConsumer implements OutputConsumer<E>{
	private static final Logger logger = LoggerFactory.getLogger(EOutputConsumer.class);
	public void consumeOutput(E output, int counter) {
		logger.debug("Consuming E>> "+output);
	}

}
