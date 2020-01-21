package fr.jobslake.repository;

import fr.jobslake.document.Offers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends CrudRepository<Offers, Long>, PagingAndSortingRepository<Offers, Long> {

    
}
