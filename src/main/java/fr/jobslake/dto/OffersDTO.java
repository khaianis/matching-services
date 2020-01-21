package fr.jobslake.dto;

import fr.jobslake.document.Offers;

import java.util.Date;

public class OffersDTO {

    private String organization;

    private String title;

    private String description;

    private Date startDate;

    private Date endDate;

    public Offers toOffers(){
        return new Offers();
    }

}
