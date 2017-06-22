package com.apress.repo;


import com.apress.domain.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by paco on 6/19/17.
 */


public interface PollRepo extends PagingAndSortingRepository<Poll, Long>
{ }