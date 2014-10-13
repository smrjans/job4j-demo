package com.talentica.job4j.demo.jobD2E;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.InputProducer;
import com.talentica.job4j.demo.model.D;

public class DInputProducer implements InputProducer<D> {
	private static final Logger logger = LoggerFactory.getLogger(DInputProducer.class);
	private int num=100000;

	public D produceInput() {
		D d = null;
		if(num>0){
			num--;
			d = new D();
			d.setId(num);
			d.setName("C name"+num);
			d.setDescription("C description"+num);
		}else{
			num=1000;
		}
		logger.debug("Produced D >> "+d);
		return d;
	}

}
