package fr.jobslake.document;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document(collection = "Offers")
public class Offers {
    @Id
    private Long id;

    private String organization;

    private String title;

    private String description;

    private Date startDate;

    private Date endDate;

}
