package storage;

import java.util.ArrayList;
import java.util.List;
import model.Client;
import model.Pass;

public class Storage {
    private final List<Client> clients = new ArrayList<>();
    private final List<Pass> passes = new ArrayList<>();

    private static Long passId = 1L;
    private static Long clientId = 1L;

    public Pass createPass(Pass pass) {
        pass.setId(passId++);
        passes.add(pass);
        return pass;
    }

    public Client createPass(Client client) {
        client.setId(clientId++);
        clients.add(client);
        return client;
    }

    public Client updateClient(Client client) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId().equals(client.getId())) {
                clients.set(i, client);
            }
        }
        return client;
    }
}
