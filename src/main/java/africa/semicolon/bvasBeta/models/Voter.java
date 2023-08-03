package africa.semicolon.bvasBeta.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Voter {
    private String id;
    private Gender gender;
    private UserInformation userInformation;
    private String voterIdentificationNumber;
    private String name;
    private Address address;
    private Integer age;
}
