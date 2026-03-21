package s6.clase;

public class Rezervare implements RezervareaAbstracta{
    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervarii;
    private String nrTel;

    public Rezervare(String numeClient, int ziuaRezervarii, int oraRezervare, String nrTel) {
        if(numeClient.length() > 1) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Ion";
        }

        if(oraRezervare > 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        } else {
            this.oraRezervare = 9;
        }

        if(ziuaRezervarii < 30) {
            this.ziuaRezervarii = ziuaRezervarii;
        } else {
            this.ziuaRezervarii = 1;
        }

        if(nrTel.length() == 10) {
            this.nrTel = nrTel;
        } else {
            this.nrTel = "0123456789";
        }
    }

    private Rezervare() {}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervarii=").append(ziuaRezervarii);
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare > 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        } else {
            this.oraRezervare = 9;
        }
    }

    public void setZiuaRezervarii(int ziuaRezervarii) {
        if(ziuaRezervarii < 30) {
            this.ziuaRezervarii = ziuaRezervarii;
        } else {
            this.ziuaRezervarii = 1;
        }
    }


    @Override
    public RezervareaAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrTel = this.nrTel;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.ziuaRezervarii = this.ziuaRezervarii;

        return rezervareNoua;
    }


}
