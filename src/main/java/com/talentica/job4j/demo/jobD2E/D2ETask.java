package com.talentica.job4j.demo.jobD2E;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.Task;
import com.talentica.job4j.demo.model.D;
import com.talentica.job4j.demo.model.E;

public class D2ETask implements Task<D,E> {
	private static final Logger logger = LoggerFactory.getLogger(D2ETask.class);
	
	public E processTask(D d) throws Exception {
		logger.debug("Processing >> "+d);
		E e = new E();
		e.setId(d.getId());
		e.setName(d.getName());
		e.setDescription(d.getDescription());
		return e;
	}
}
