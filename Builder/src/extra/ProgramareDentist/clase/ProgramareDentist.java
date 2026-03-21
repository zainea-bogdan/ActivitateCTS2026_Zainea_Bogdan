package extra.ProgramareDentist.clase;

public class ProgramareDentist {
    private boolean areDetartare;
    private boolean areNevoieDeAnestezie;
    private boolean areInterventieCanalDentar;
    private String numePaciet;

    private ProgramareDentist(boolean areDetartare, boolean areNevoieDeAnestezie, boolean areInterventieCanalDentar, String numePaciet) {
        this.areDetartare = areDetartare;
        this.areNevoieDeAnestezie = areNevoieDeAnestezie;
        this.areInterventieCanalDentar = areInterventieCanalDentar;
        this.numePaciet = numePaciet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProgramareDentist{");
        sb.append("areDetartare=").append(areDetartare);
        sb.append(", areNevoieDeAnestezie=").append(areNevoieDeAnestezie);
        sb.append(", areInterventieCanalDentar=").append(areInterventieCanalDentar);
        sb.append(", numePaciet='").append(numePaciet).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class PrgDentistBuilder implements AbstractBuilder
    {
        private ProgramareDentist programare;

        public PrgDentistBuilder(String numePaciet) {
            this.programare = new ProgramareDentist(false, false, false,  numePaciet);
        }

        public PrgDentistBuilder setAreDetartare(boolean areDetartare) {
            this.programare.areDetartare = areDetartare;
            return this;
        }

        public PrgDentistBuilder setAreNevoieDeAnestezie(boolean areNevoieDeAnestezie) {
            this.programare.areNevoieDeAnestezie = areNevoieDeAnestezie;
            return this;
        }

        public PrgDentistBuilder setAreInterventieCanalDentar(boolean areInterventieCanalDentar) {
            this.programare.areInterventieCanalDentar = areInterventieCanalDentar;
            return this;
        }

        public PrgDentistBuilder setNumePaciet(String numePaciet) {
            this.programare.numePaciet = numePaciet;
            return this;
        }

        @Override
        public ProgramareDentist build() {
            return programare;
        }
    }
}
