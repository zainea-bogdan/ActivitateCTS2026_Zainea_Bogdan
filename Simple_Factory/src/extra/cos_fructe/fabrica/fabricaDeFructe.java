package extra.cos_fructe.fabrica;

import extra.cos_fructe.familie_clase.Fruct;
import extra.cos_fructe.familie_clase.Mar;
import extra.cos_fructe.familie_clase.Para;
import extra.cos_fructe.familie_clase.Nuca;

import java.lang.annotation.Retention;

public class fabricaDeFructe {
    public Fruct getFruct(TipuriDeFructe tip, boolean esteBun, boolean areSeminte)
    {
        if(tip==TipuriDeFructe.MAR)
        {
            return new Mar(esteBun,areSeminte);
        }
        else if(tip==TipuriDeFructe.PARA)
        {
            return new Para(esteBun,areSeminte);
        }
        else
        {
            return new Nuca(esteBun,areSeminte);
        }
    }
}
