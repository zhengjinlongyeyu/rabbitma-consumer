package com.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

// 监听制定队列
@Component
public class ConsumerLister {
	
	
	/**
	 * 
	 * @description 
	 * @author Jeff
	 * @date 2022年3月18日
	 * @param json
	 * 消费队列不同 交换机名称相同  消费一样的消息
	 * 消费队列相同 交换机名称相同 轮训消费消息 都是排他对列
	 */
	@RabbitHandler// 获取到监听数据的处理方法
	@RabbitListener(queues="topics")
	public void name(JSONObject json) {
		System.out.println("+++++>"+json.toString());
	}

}
