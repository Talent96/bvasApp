package africa.semicolon.bvasBeta.services;

import africa.semicolon.bvasBeta.dtos.request.VoterRegistrationRequest;
import africa.semicolon.bvasBeta.dtos.response.VoterRegistrationResponse;
import africa.semicolon.bvasBeta.models.Address;
import africa.semicolon.bvasBeta.models.Gender;
import africa.semicolon.bvasBeta.models.UserInformation;
import africa.semicolon.bvasBeta.models.Voter;
import africa.semicolon.bvasBeta.utils.AppUtils.*;

import java.math.BigInteger;
import java.util.UUID;

public class BvasBetaVoterService implements VoterService{

    @Override
    public VoterRegistrationRequest register(VoterRegistrationRequest voterRegistrationRequest) {
        Voter voter = new Voter();
        voter.setAge(voterRegistrationRequest.getAge());
        Gender voterGender = Gender.valueOf(voterRegistrationRequest.getGender());
        voter.setGender(voterGender);
        Address address = new Address();
        address.setTown(voterRegistrationRequest.getTown());
        address.setState(voterRegistrationRequest.getState());
        address.setStreet(voterRegistrationRequest.getStreet());
        address.setHouseNumber(voterRegistrationRequest.getHouseNumber());
        address.setLocalGovernment(voterRegistrationRequest.getLga());
        voter.setAddress(address);

        UserInformation userInformation = new UserInformation();
        userInformation.setUsername(voterRegistrationRequest.getUsername());
        userInformation.setPassword(voterRegistrationRequest.getPassword());
        voter.setUserInformation(userInformation);
hn
        VoterRegistrationResponse voterRegistrationResponse = new VoterRegistrationResponse();
        return null;
    }
    private  String generateVoterIdentificationNumber(){
       String res = "";
        int codePointForA = BigInteger.valueOf(97).intValue();
        int codePointForZ = BigInteger.valueOf(122).intValue();
        int count = 0;

        for (int index = codePointForA; index <codePointForZ; index++) {
            res += index;
        }
        for (int index = 0; index <= 9 ; index++) {
            res += index;

        }
       res = UUID.nameUUIDFromBytes(res.getBytes()).toString();
        String result = "";
        for (int index = 0; index < res.length(); index++) {
            if (res.charAt(index) != '-') result += res.charAt(index);

        }
        String result1 = "";
        for (int index = 0; index < result.length(); index++) {
            if (index % 5 == 0) result1 += " ";
            else  result1 += result.charAt(index);

        }
        return result1.substring(0, result1.length() - 8);
    }
}
