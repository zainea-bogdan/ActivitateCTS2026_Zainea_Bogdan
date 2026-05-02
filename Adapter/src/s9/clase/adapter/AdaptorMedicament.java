package s9.clase.adapter;

import s9.clase.farmacie.Medicament;

public class AdaptorMedicament extends Medicament {
    private s9.clase.spital.Medicament medSpital;

    public AdaptorMedicament(s9.clase.spital.Medicament medSpital) {
        super(medSpital.getNume());
        this.medSpital = medSpital;
    }

    @Override
    public void cumparaMedicament()
    {
        medSpital.achizitioneazaMedicament();
    }
}
