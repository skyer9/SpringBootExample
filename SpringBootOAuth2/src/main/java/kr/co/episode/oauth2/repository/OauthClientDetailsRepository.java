package kr.co.episode.oauth2.repository;

import kr.co.episode.oauth2.entity.OauthClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OauthClientDetailsRepository extends JpaRepository<OauthClientDetails, String> {
    OauthClientDetails findByClientIdAndClientSecret(String clientId, String clientSecret);
}
