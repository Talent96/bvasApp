package africa.semicolon.bvasBeta.dtos.request;

import lombok.Data;

@Data
public class VoterRegistrationRequest {
    private String name;
    private String username;
    private String password;
    private String houseNumber;
    private String street;
    private String town;
    private String lga;
    private String state;
    private String gender;
    private int age;
}
