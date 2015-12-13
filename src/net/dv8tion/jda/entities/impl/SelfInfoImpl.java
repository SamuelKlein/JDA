package net.dv8tion.jda.entities.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.dv8tion.jda.entities.TextChannel;
import net.dv8tion.jda.entities.SelfInfo;

public class SelfInfoImpl extends UserImpl implements SelfInfo
{
    private String email;
    private List<TextChannel> mutedChannels = new ArrayList<>();
    private boolean verified;

    @Override
    public String getEmail()
    {
        return email;
    }

    @Override
    public List<TextChannel> getMutedChannels()
    {
        return Collections.unmodifiableList(mutedChannels);
    }

    @Override
    public boolean isVerified()
    {
        return verified;
    }

    public SelfInfoImpl setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public SelfInfoImpl setMutedChannels(List<TextChannel> mutedChannels)
    {
        this.mutedChannels = mutedChannels;
        return this;
    }

    public SelfInfoImpl setVerified(boolean verified)
    {
        this.verified = verified;
        return this;
    }

    public List<TextChannel> getMutedChannelsModifiable()
    {
        return mutedChannels;
    }
}