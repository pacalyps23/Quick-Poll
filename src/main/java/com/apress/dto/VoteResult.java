package com.apress.dto;

import java.util.Collection;

/**
 * Created by luisgarcia on 6/20/17.
 */
public class VoteResult
{
    private int totalVotes;
    private Collection<OptionCount> results;

    public int getTotlVotes()
    {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes)
    {
        this.totalVotes = totalVotes;
    }

    public Collection<OptionCount> getResults()
    {
        return results;
    }

    public void setResults(Collection<OptionCount> results)
    {
        this.results = results;
    }
}
