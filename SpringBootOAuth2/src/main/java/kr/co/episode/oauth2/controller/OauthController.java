package kr.co.episode.oauth2.controller;

import kr.co.episode.oauth2.entity.OauthClientDetails;
import kr.co.episode.oauth2.service.OauthClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("oauth")
public class OauthController {
    @Autowired
    private OauthClientDetailsService oauthClientDetailsService;

    @RequestMapping(value = "/header", method = RequestMethod.GET)
    public String headerAuthorization(@RequestHeader("X-Site-Client-Id") String clientId,
                                      @RequestHeader("X-Site-Client-Secret") String clientSecret) {

        OauthClientDetails oauthClientDetails
                = oauthClientDetailsService.getOauthClientDetails(clientId, clientSecret);

        return oauthClientDetails != null ? "Y" : "N";
    }
}
