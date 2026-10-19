package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.domain.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    Client afficherClientById(Long id);
    List<Client> afficherAllClients();
    void deleteClientById(Long id);
}
