package s10_normal.clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerLinie {
    Map<Integer, Linie> registru=new HashMap<Integer, Linie>();

    public Linie getLinie(String primaStatie, String ultimaStatie, int nrLinie){
        if(registru.containsKey(nrLinie)){
            return registru.get(nrLinie);
        }else{
            registru.put(nrLinie, new Linie(primaStatie, ultimaStatie, nrLinie));
            return registru.get(nrLinie);
        }
    }
}
