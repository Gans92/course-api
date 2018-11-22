package com.gagan.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.gagan.springbootstarter.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
