package com.apress.repo;

import com.apress.domain.Vote;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by paco on 6/19/17.
 */
public interface VoteRepo extends CrudRepository<Vote, Long>
{
}
