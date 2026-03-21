# Builder Pattern

## Ce este Builder?

Builder este un pattern de creare folosit pentru a construi obiecte complexe pas cu pas, în special când există mulți parametri opționali.

---

## Când se folosește?

* există multe opțiuni sau parametri opționali
* constructorii devin greu de utilizat
* se dorește construirea controlată a obiectului

---

## Structură

### 1. Clasa principală

* atribute private
* constructor privat

```java
private boolean areDetartare;
private boolean areNevoieDeAnestezie;
private boolean areInterventieCanalDentar;
private String numePacient;

private ProgramareDentist(boolean areDetartare, boolean areNevoieDeAnestezie,
                          boolean areInterventieCanalDentar, String numePacient) {
    this.areDetartare = areDetartare;
    this.areNevoieDeAnestezie = areNevoieDeAnestezie;
    this.areInterventieCanalDentar = areInterventieCanalDentar;
    this.numePacient = numePacient;
}
```

---

### 2. Builder (inner static class)

* clasă statică internă
* conține instanța obiectului
* metode de setare (returnează builder-ul)

```java
public static class PrgDentistBuilder implements AbstractBuilder {

    private ProgramareDentist programare;

    public PrgDentistBuilder(String numePacient) {
        this.programare = new ProgramareDentist(false, false, false, numePacient);
    }

    public PrgDentistBuilder setAreDetartare(boolean val) {
        this.programare.areDetartare = val;
        return this;
    }

    public PrgDentistBuilder setAreNevoieDeAnestezie(boolean val) {
        this.programare.areNevoieDeAnestezie = val;
        return this;
    }

    public PrgDentistBuilder setAreInterventieCanalDentar(boolean val) {
        this.programare.areInterventieCanalDentar = val;
        return this;
    }

    public PrgDentistBuilder setNumePacient(String nume) {
        this.programare.numePacient = nume;
        return this;
    }

    @Override
    public ProgramareDentist build() {
        return programare;
    }
}
```

---

### 3. AbstractBuilder

```java
public interface AbstractBuilder {
    ProgramareDentist build();
}
```

---

## Utilizare

```java
ProgramareDentist programare = new ProgramareDentist.PrgDentistBuilder("Ion")
        .setAreDetartare(true)
        .setAreNevoieDeAnestezie(true)
        .build();
```

---

## Observații

* metodele trebuie să returneze builder-ul pentru chaining
* se pot seta valori default în constructor
* parametrul obligatoriu (ex: nume) se dă în constructorul builder-ului

---

## Avantaje

* cod clar și lizibil
* suport pentru parametri opționali
* evită constructori complicați

---

## Dezavantaje

* mai mult cod față de un constructor simplu

---

## Concluzie

Builder este potrivit când obiectele au multe opțiuni și necesită construcție flexibilă.
