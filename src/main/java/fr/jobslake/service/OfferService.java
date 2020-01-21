package fr.jobslake.service;

import fr.jobslake.document.Offers;
import fr.jobslake.dto.OffersDTO;
import fr.jobslake.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;


    private Offers createOffer(OffersDTO offersDTO) {

        return offerRepository.save(offersDTO.toOffers());

    }
}
