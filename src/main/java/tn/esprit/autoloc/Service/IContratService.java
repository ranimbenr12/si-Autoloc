package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat ModifierContrat(Contrat contrat);
    Contrat afficherContratById(Long id);
    List<Contrat> listerContrats();
    void deleteContrat();
}
