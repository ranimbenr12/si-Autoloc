package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.domain.Agence;
import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    Agence modifierAgence(Agence agence);
    Agence afficherAgenceById(Long id);
    List<Agence> listerAgences();
    void supprimerAgence(Long id);
}