package africa.semicolon.idealbvas.repositories;

import africa.semicolon.bvasBeta.models.UserInformation;
import africa.semicolon.bvasBeta.repositories.BvasUserInformationRepository;
import africa.semicolon.bvasBeta.repositories.UserInformationRepository;
import africa.semicolon.idealbvas.models.UserInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BvasUserInformationRepositoryTest {
    private final UserInformationRepository userInformationRepository = new BvasUserInformationRepository();

    private UserInformation savedUserInformation;

    @BeforeEach
    public void setUp(){
        UserInformation userInformation = buildUserInformation();
        savedUserInformation = userInformationRepository.save(userInformation);
    }

    @Test
    @DisplayName("save userInformation")
    public void testSaveUserInformation(){
        assertNotNull(savedUserInformation);
        assertNotNull(savedUserInformation.getId());
    }

    @Test
    @DisplayName("Find user by Id")
    public void findUserByIdTest(){
        savedUserInformation =  userInformationRepository.findById(savedUserInformation.getId());
        assertNotNull( savedUserInformation.getId());

    }

    @Test
    @DisplayName("find all users")
    public void testFindAllUsers(){
        UserInformation savedUserInformationTwo = new UserInformation();
        UserInformation edUserInformationThree = new UserInformation();
        userInformationRepository.save(savedUserInformationTwo);
        userInformationRepository.save(edUserInformationThree);
        List<UserInformation>userInformation = userInformationRepository.findAll();
        assertEquals(3,userInformation.size());
        assertNotNull(userInformation.get(0));
        assertNotNull(userInformation.get(1));
        assertNotNull(userInformation.get(2));
    }

    public UserInformation buildUserInformation() {
        UserInformation userInformation = new UserInformation();
        // userInformation.setId("1");
        userInformation.setPassword("abc123");
        userInformation.setUsername("richie");

        return userInformation;


    }
}