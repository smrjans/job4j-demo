package com.talentica.job4j.demo.jobD2F;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.Task;
import com.talentica.job4j.demo.model.D;
import com.talentica.job4j.demo.model.F;

public class D2FTask implements Task<D,F> {
	private static final Logger logger = LoggerFactory.getLogger(D2FTask.class);
	
	public F processTask(D d) throws Exception {
		logger.debug("Processing >> "+d);
		F f = new F();
		f.setId(d.getId());
		f.setName(d.getName());
		f.setDescription(d.getDescription());
		return f;
	}
}
