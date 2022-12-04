package uir.info.projetintegre.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Fichier {
    @Id
    @SequenceGenerator(
            name = "fichier_id_sequence",
            sequenceName = "fichier_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fichier_id_sequence"
    )

    private Integer idF;

    private String nom;
    private String type;
    private Date dateUpload;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String cheminFichier;

    //TODO: Link each file to the uploader via the "compte" entity


}
