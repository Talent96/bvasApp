package africa.semicolon.bvasBeta.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInformation {
    private String id;
    private String username;
    private String password;
}
