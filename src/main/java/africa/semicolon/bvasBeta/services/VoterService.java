package africa.semicolon.bvasBeta.services;

import africa.semicolon.bvasBeta.dtos.request.VoterRegistrationRequest;

public interface VoterService {
    VoterRegistrationRequest register(VoterRegistrationRequest voterRegistrationRequest);
}
