package africa.semicolon.bvasBeta.services;

import africa.semicolon.bvasBeta.dtos.request.VoterRegistrationRequest;
import africa.semicolon.bvasBeta.dtos.response.VoterRegistrationResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BvasBetaVoterServiceTest {
    private  VoterService voterService = new BvasBetaVoterService();
    @BeforeEach
    void setUp(){

    }


    @Test
    void registerTest(){
        VoterRegistrationRequest registrationRequest = new VoterRegistrationRequest();
        registrationRequest.setAge(100);
        registrationRequest.setName("Joe");
        registrationRequest.setLga("townHall");
        registrationRequest.setGender("OTHERS");
        registrationRequest.setUsername("Joe95");
        registrationRequest.setPassword("12345");
        registrationRequest.setState("Lagos");
        registrationRequest.setTown("sabo");
        registrationRequest.setStreet("herbelt");
        registrationRequest.setHouseNumber("55");

        VoterRegistrationResponse registrationResponse = voterService.register();

    }
}