package africa.semicolon.bvasBeta.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private  String houseNumber;
    private String street;
    private String town;
    private String localGovernment;
    private String state;
}
