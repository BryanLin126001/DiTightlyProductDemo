package ntt.global.controller;

import org.springframework.stereotype.Component;

@Component
public class UserContextImpl implements IUserContext
{
    @Override
    public boolean IsPreferredUser()
    {
        return true;
    }
}
