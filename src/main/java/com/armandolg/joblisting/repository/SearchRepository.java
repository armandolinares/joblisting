package com.armandolg.joblisting.repository;

import com.armandolg.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
