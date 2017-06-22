package com.apress;

import com.mangofactory.swagger.models.dto.Authorization;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configuration.ClientDetailsServiceConfiguration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

import javax.inject.Inject;

/**
 * Created by luisgarcia on 6/22/17.
 */
public class OAuth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter
{
    @Inject
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception
    {
        endpoints.authenticationManager(this.authenticationManager);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception
    {
        clients.inMemory()
                .withClient("quickpolliOSClient")
                .secret("top_secret")
                .authorizedGrantTypes("password")
                .scopes("read", "write")
                .resourceIds("QuickPoll_Resources");
    }


}
