package com.apress.repo;


import com.apress.domain.Poll;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by paco on 6/19/17.
 */


public interface PollRepo extends CrudRepository<Poll, Long>
{ }