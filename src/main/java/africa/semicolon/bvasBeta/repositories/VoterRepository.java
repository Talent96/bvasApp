package africa.semicolon.bvasBeta.repositories;

import africa.semicolon.bvasBeta.models.Address;
import africa.semicolon.bvasBeta.models.Voter;

import java.util.List;

public interface VoterRepository {
    Voter findById(String id);
    List<Voter> findAll();
    Voter save(Voter voter);
    void deleteById(String id);
}
