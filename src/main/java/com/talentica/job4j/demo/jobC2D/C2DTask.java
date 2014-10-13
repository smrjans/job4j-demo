package com.talentica.job4j.demo.jobC2D;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.Task;
import com.talentica.job4j.demo.model.C;
import com.talentica.job4j.demo.model.D;

public class C2DTask implements Task<C, D> {
	private static final Logger logger = LoggerFactory.getLogger(C2DTask.class);
	
	public D processTask(C c) throws Exception {
		logger.debug("Processing >> "+c);
		D d = new D();
		d.setId(c.getId());
		d.setName(c.getName());
		d.setDescription(c.getDescription());
		return d;
	}

}
