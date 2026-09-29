package tn.esprit.autolocapi.domaine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
    public class Paiement {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idPaiement;
        private BigDecimal montant;
        private LocalDate datePaiement;
        @Enumerated(EnumType.STRING)
        private ModePaiement modePaiement;
        @ManyToOne
        @JoinColumn(name = "contrat_id")
        private Contrat contrat;;
}
