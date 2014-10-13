package com.talentica.job4j.demo.jobA2B;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.Task;
import com.talentica.job4j.demo.model.A;
import com.talentica.job4j.demo.model.B;

public class A2BTask implements Task<A, B> {
	private static final Logger logger = LoggerFactory.getLogger(A2BTask.class);
	
	public B processTask(A a) throws Exception {
		logger.debug("Processing >> "+a);
		B b = new B();
		b.setId(a.getId());
		b.setName(a.getName());
		b.setDescription(a.getDescription());
		return b;
	}

}
