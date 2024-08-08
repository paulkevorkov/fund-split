package fundsplit.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fundsplit.model.Sponsor;

public interface SponsorRepository extends CrudRepository<Sponsor, String>{
    
    Sponsor findSponsorByName(String name);

    List<Sponsor> findSponsorsByEvent_Title(String title);

    List<Sponsor> findAll();

    void deleteSponsorByName(String name);

    void deleteSponsorById(int id);
}
