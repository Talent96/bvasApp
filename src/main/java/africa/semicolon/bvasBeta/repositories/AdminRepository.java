package africa.semicolon.bvasBeta.repositories;

import africa.semicolon.bvasBeta.models.Address;
import africa.semicolon.bvasBeta.models.Admin;

import java.util.List;

public interface AdminRepository {
    Admin findById(String id);
    List<Admin> findAll();
    Admin save(Admin admin);
    void deleteById(String id);
}
