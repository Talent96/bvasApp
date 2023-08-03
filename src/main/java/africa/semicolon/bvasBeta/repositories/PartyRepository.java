package africa.semicolon.bvasBeta.repositories;

import africa.semicolon.bvasBeta.models.Address;
import africa.semicolon.bvasBeta.models.Party;

import java.util.List;

public interface PartyRepository {
   Party findById(String id);
    List<Party> findAll();
    Party save(Party party);
    void deleteById(String id);
}
