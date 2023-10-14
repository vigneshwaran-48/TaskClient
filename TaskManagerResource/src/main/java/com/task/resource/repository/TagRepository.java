package com.task.resource.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.resource.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

	Optional<Tag> findByTagName(String tagName);
	
	Optional<List<Tag>> findByTagColor(String tagColor);
	
	Optional<List<Tag>> findByUserId(String userId);
	
}