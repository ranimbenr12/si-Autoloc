package tn.esprit.autoloc.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IContratServiceemp implements IContratService{
    private final ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return  contratRepository.save(contrat) ;
    }

    @Override
    public Contrat ModifierContrat(Contrat contrat) {
        return contratRepository.save(contrat) ;
    }

    @Override
    public Contrat afficherContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> listerContrats() {
        return contratRepository.findAll();
    }

    @Override
    public void deleteContrat() {
        contratRepository.deleteAll();
    }



}
