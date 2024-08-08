package fundsplit.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fundsplit.model.Contribution;

public interface ContributionRepository extends CrudRepository<Contribution, String>{

    Contribution findContributionByTitle(String title); 

    Contribution findContributionByDate(LocalDateTime localDateTime);

    List<Contribution> findContributionsByAmount(double amount);

    List<Contribution> findContributionsBySponsor_Name(String name);

    void deleteContributionById(int id);
}