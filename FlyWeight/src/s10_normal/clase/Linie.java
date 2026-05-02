package s10_normal.clase;

public class Linie implements LinieDeTransport{
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    public Linie(String primaStatie, String ultimaStatie, int nrLinie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public void descriereLinie(Autobuz autobuz) {
        StringBuilder sb = new StringBuilder("Linie{");
        sb.append("primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append(", nrLinie=").append(nrLinie).append('\'');
        sb.append(", autobuz=").append(autobuz).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }

    @Override
    public void nrMaxPasageriLinie(Autobuz autobuz) {
        StringBuilder sb = new StringBuilder("Linie{");
        sb.append("primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append(", nrLinie=").append(nrLinie).append('\'');
        sb.append(", nrLocuri=").append(autobuz.getNrLocuri()).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }
}
