package africa.semicolon.bvasBeta.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Party {
    private UserInformation userInformation;
    private String id;
}
