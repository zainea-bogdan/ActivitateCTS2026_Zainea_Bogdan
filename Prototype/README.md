# Prototype Pattern

## Ce este Prototype?

Prototype este un pattern de creare care permite copierea obiectelor existente, fără a depinde de clasele lor concrete.

Scopul este evitarea creării de la zero a unor obiecte costisitoare.

---

## Când se folosește?

* obiectele sunt costisitor de creat
* obiectele sunt complexe
* se dorește duplicarea rapidă a unor instanțe existente

---

## Structură

### 1. Interfața Prototype

* definește metoda `clone()`
* returnează tipul abstract

```java id="3c5s8g"
public interface RezervareaAbstracta {
    RezervareaAbstracta clone();
}
```

---

### 2. Clasa concretă

* conține atribute
* constructori (cu și fără parametri)
* implementează metoda `clone()`

```java

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

```

---

## Utilizare

```java 
RezervareaAbstracta rez1 = new Rezervare("Ana", 20, 13, "0788888888");
RezervareaAbstracta rez2 = (Rezervare) rez1.clone();

((Rezervare)rez2).setOraRezervare(10);
((Rezervare)rez2).setZiuaRezervarii(10);

System.out.println(rez1.toString());
System.out.println(rez2.toString());
```

---

## Observații

* clonarea poate fi:

    * shallow copy (copiere simplă)
    * deep copy (copiere completă a obiectelor interne) - FAVORITA
* se evită crearea obiectelor de la zero

---

## Avantaje

* performanță mai bună pentru obiecte costisitoare
* reduce duplicarea logicii de creare

---

## Dezavantaje

* implementarea clonării poate fi complexă
* necesită atenție la copierea obiectelor interne

---

## Concluzie

Prototype este util atunci când obiectele sunt costisitoare sau complexe și este mai eficient să fie copiate decât recreate.
