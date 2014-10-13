package com.talentica.job4j.demo.jobB2C;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.OutputConsumer;
import com.talentica.job4j.demo.model.C;

public class COutputConsumer implements OutputConsumer<C>{
	private static final Logger logger = LoggerFactory.getLogger(COutputConsumer.class);
	public void consumeOutput(C output, int counter) {
		logger.debug("Consuming C >> "+output);
	}

}
