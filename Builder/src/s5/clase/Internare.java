package s5.clase;

public class Internare {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;
    private String numePacient;

    private Internare(boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
        this.numePacient = numePacient;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuci=" + papuci +
                ", halat=" + halat +
                ", numePacient='" + numePacient + '\'' +
                '}';
    }



    public static class InternareBuilder implements AbstractBuilder
    {
        private boolean patRabatabil;
        private boolean micDejun;
        private boolean papuci;
        private boolean halat;
        private String numePacient;

        public InternareBuilder(String numePacient) {
            this.numePacient = numePacient;
        }

        public InternareBuilder setPat(boolean arePat) {
            this.patRabatabil = arePat;
            return this;
        }

        public InternareBuilder setMic(boolean areMic) {
            this.micDejun = areMic;
            return this;
        }

        public InternareBuilder setPapuci(boolean arePapuci) {
            this.papuci = arePapuci;
            return this;
        }

        public InternareBuilder setHalat(boolean areHalat) {
            this.halat = areHalat;
            return this;
        }

        public InternareBuilder setNume(String nume) {
            this.numePacient = nume;
            return this;
        }

        @Override
        public Internare build() {
            return new Internare(patRabatabil, micDejun, papuci, halat, numePacient);
        }
    }
}
