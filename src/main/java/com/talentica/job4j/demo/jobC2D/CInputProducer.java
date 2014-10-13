package com.talentica.job4j.demo.jobC2D;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.InputProducer;
import com.talentica.job4j.demo.model.C;

public class CInputProducer implements InputProducer<C> {
	private static final Logger logger = LoggerFactory.getLogger(CInputProducer.class);
	private int num=100000;

	public C produceInput() {
		C c = null;
		if(num>0){
			num--;
			c = new C();
			c.setId(num);
			c.setName("C name"+num);
			c.setDescription("C description"+num);
		}else{
			num=1000;
		}
		logger.debug("Produced C >> "+c);
		return c;
	}

}
