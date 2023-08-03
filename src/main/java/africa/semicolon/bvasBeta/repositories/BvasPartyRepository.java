package africa.semicolon.bvasBeta.repositories;

import africa.semicolon.bvasBeta.models.Party;
import africa.semicolon.bvasBeta.models.UserInformation;
import africa.semicolon.bvasBeta.utils.AppUtils;

import java.util.ArrayList;
import java.util.List;

public class BvasPartyRepository implements PartyRepository{
    private final List<Party> politicalParties = new ArrayList<>();
    private final UserInformationRepository userInformationRepository = new BvasUserInformationRepository();

    @Override
    public Party findById(String id) {
//        Party foundParty = politicalParties.stream().filter(party -> party.getId().equals(id)).f
//        if (foundParty == null) {
//            String userInformationId = AppUtils.getUserInformationId(foundParty.getId());
        Party foundParty  = null;
        for (Party party : politicalParties){
            if (party.getId().equals(id)) foundParty = party;
        }
        if (foundParty != null){
            String userInformationId = AppUtils.getUserInformationId(foundParty.getId());
            UserInformation userInformation = userInformationRepository.findById(userInformationId);
            foundParty.setUserInformation(userInformation);
        }
        return foundParty;
    }

    @Override
    public List<Party> findAll() {
        List<Party> foundPoliticalParties = new ArrayList<>();
        for (Party party : politicalParties){
            String userInformationId = AppUtils.getUserInformationId(party.getId());
            if (userInformationId != null){
                UserInformation foundUserInfomation = userInformationRepository
            }
        }
        return politicalParties;
    }

    @Override
    public Party save(Party party) {
        party.setId((AppUtils.generateId()));
        boolean isPartyWithUserInformation = party.getUserInformation() != null;
        if (isPartyWithUserInformation){
            UserInformationRepository savedUserInformation = (UserInformationRepository) userInformationRepository.save(party.getUserInformation());
            AppUtils.linkUserToUserInformation(party.getId(), savedUserInformation.getId());
        }
        politicalParties.add(party);
        return party;
    }

    @Override
    public void deleteById(String id) {
        var foundParty = findById(id);
        if (foundParty != null) politicalParties.remove(foundParty);
    }
    private void saveUserInformation(Party party){
        UserInformation savedUserInformation = userInformationRepository.save(party.getUserInformation());
        String partyId = party.getId();
        String userInformationId = savedUserInformation.getId();
        AppUtils.linkUserToUserInformation(partyId, userInformationId);
    }
}
