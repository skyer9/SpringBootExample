package kr.co.episode.oauth2.service;

import kr.co.episode.oauth2.entity.OauthClientDetails;
import kr.co.episode.oauth2.repository.OauthClientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OauthClientDetailsService {
    @Autowired
    OauthClientDetailsRepository oauthClientDetailsRepository;

    public OauthClientDetails getOauthClientDetails(String clientId, String clientSecret) {
        return oauthClientDetailsRepository.findByClientIdAndClientSecret(clientId, clientSecret);
    }
}
