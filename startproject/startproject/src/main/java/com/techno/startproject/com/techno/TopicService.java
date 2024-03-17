package com.techno.startproject.com.techno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<topic> topics = new ArrayList<>( Arrays.asList(
			new topic("spring", "springBoot", "springController"),
			new topic("java", "javaBoot", "javaController"),
			new topic("javascript", "javascriptBoot", "javascriptController")));
	
	public List<topic> getAllTopics()
	{
		return topics;
		
	}
	
	public topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id, topic topic) {
		for (int i = 0; i < topics.size(); i++)
		{
			topic t = topics.get(i);
			if (t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
			
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	
	}

}
