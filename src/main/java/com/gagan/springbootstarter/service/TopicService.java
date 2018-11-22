package com.gagan.springbootstarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gagan.springbootstarter.entity.Topic;
import com.gagan.springbootstarter.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	/*private List<Topic> topics = new ArrayList<Topic> (Arrays.asList(
			new Topic("Java","Java Demo", "Java Development Course"),
			new Topic("JavaScript","JavaScript Demo", "JavaScript Development Course"),
			new Topic("Spring","Spring Boot Demo", "Spring Boot Development Course")
			));*/
	
	public List<Topic> getTopics(){
		return (List<Topic>) topicRepository.findAll();//forEach(topics::add);
		//return topics;
		//return topicRepository.findAll().forEach(topics::add);
	}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id);
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();//Streams and Lambda functions.
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topicVal, String id) {
		/*for (Topic topic : topics) {
			if(topic.getId().equalsIgnoreCase(id)){
				topic.setDescription(topicVal.getDescription());
				topic.setId(id);
				topic.setName(topicVal.getName());
				return;
			}
		}*/
		topicRepository.save(topicVal);
		
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
		//topics.removeIf(t -> t.getId().equals(id));
	}
}
