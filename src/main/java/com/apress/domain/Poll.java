package com.apress.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by paco on 6/19/17.
 */


@Entity
public class Poll
{
    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private Long id;

    @Column(name="QUESTION")
    private String question;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="POLL_ID")
    @OrderBy
    private Set<Option> options;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public Set<Option> getOptions()
    {
        return options;
    }

    public void setOptions(Set<Option> options)
    {
        this.options = options;
    }

}
