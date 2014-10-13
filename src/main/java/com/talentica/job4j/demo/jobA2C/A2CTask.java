package com.talentica.job4j.demo.jobA2C;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.Task;
import com.talentica.job4j.demo.model.A;
import com.talentica.job4j.demo.model.C;

public class A2CTask implements Task<A,C> {
	private static final Logger logger = LoggerFactory.getLogger(A2CTask.class);
	
	public C processTask(A a) throws Exception {
		logger.debug("Processing >> "+a);
		C c = new C();
		c.setId(a.getId());
		c.setName(a.getName());
		c.setDescription(a.getDescription());
		return c;
	}

}
