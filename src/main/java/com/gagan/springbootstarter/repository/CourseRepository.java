package com.gagan.springbootstarter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gagan.springbootstarter.entity.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByName(String name);
	
	public List<Course> findByTopicId(String topicId);
}
