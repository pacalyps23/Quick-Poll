package com.apress.repo;

import com.apress.domain.Option;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by paco on 6/19/17.
 */


public interface OptionRepo extends CrudRepository<Option, Long>
{ }