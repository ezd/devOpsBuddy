package com.devopsbuddy.test.unit;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import com.devopsbuddy.utils.UserUtils;
import com.devopsbuddy.web.controllers.ForgotMyPasswordController;
import com.devopsbuddy.web.domain.frontend.BasicAccountPayload;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import java.util.UUID;

/**
 * Created by tedonema on 15/04/2016.
 */
public class UserUtilsUnitTest {

    private MockHttpServletRequest mockHttpServletRequest;

    PodamFactory podamFactory;
    
    @Before
    public void init() {
        mockHttpServletRequest = new MockHttpServletRequest();
        
        podamFactory= new PodamFactoryImpl();
    }

    @Test
    public void testPasswordResetEmailUrlConstruction() throws Exception {
    	
    	mockHttpServletRequest.setServerPort(8080); //Default is 80
        String token = UUID.randomUUID().toString();
        long userId = 123456;

        String expectedUrl = "http://localhost:8080" +
                ForgotMyPasswordController.CHANGE_PASSWORD_PATH + "?id=" + userId + "&token=" + token;

        String actualUrl = UserUtils.createPasswordResetUrl(mockHttpServletRequest, userId, token);

        Assert.assertEquals(expectedUrl, actualUrl);

    }
    @Test
    public void testWebUserToDomainUser(){
    	BasicAccountPayload basicAccountPayload=podamFactory.manufacturePojoWithFullData(BasicAccountPayload.class);
    	basicAccountPayload.setEmail("something@gmail.com");
        
    	User user=UserUtils.fromWebUserToDomainUser(basicAccountPayload);
    	
    	Assert.assertNotNull(user);
    	
    	Assert.assertEquals(basicAccountPayload.getUserName(), user.getUsername());
    }
}