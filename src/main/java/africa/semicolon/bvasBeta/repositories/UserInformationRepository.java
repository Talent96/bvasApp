package africa.semicolon.bvasBeta.repositories;

import africa.semicolon.bvasBeta.models.Address;
import africa.semicolon.bvasBeta.models.UserInformation;

import java.util.List;

public interface UserInformationRepository {
    UserInformation findById(String id);
    List<UserInformation> findAll();
    UserInformation save(UserInformation userInformation);
    void deleteById(String id);
}
