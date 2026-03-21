# Simple Factory Pattern

## Ce este Simple Factory?

Simple Factory este un pattern de creare care oferă o metodă centralizată pentru a crea obiecte dintr-o aceeași familie de clase, fără ca utilizatorul să cunoască detaliile de instanțiere.

Scopul este separarea logicii de creare a obiectelor de restul aplicației.

---

## Când se folosește?

Se folosește atunci când:

* există o familie de obiecte (ex: Meniu, Fruct, Comandă)
* trebuie create obiecte diferite din aceeași categorie
* se dorește evitarea folosirii directe a `new`

Dacă apar mai multe familii de obiecte, este mai potrivit Factory Method sau Abstract Factory.

---

## Structură

### 1. Familia de clase

* o clasă abstractă sau interfață
* clase concrete care o extind sau implementează

```java
public abstract class Fruct {
    public abstract void descriere();
}
```

```java
public class Mar extends Fruct {
    public void descriere() {
        System.out.println("Acesta este un mar");
    }
}
```

```java
public class Banana extends Fruct {
    public void descriere() {
        System.out.println("Aceasta este o banana");
    }
}
```

---

### 2. Fabrica

#### Enum pentru tipuri

```java
public enum TipFruct {
    MAR,
    BANANA
}
```

#### Clasa Factory

* conține metoda de creare
* returnează tipul abstract

```java
public class FructFactory {

    public static Fruct getFruct(TipFruct tip) {
        switch (tip) {
            case MAR:
                return new Mar();
            case BANANA:
                return new Banana();
            default:
                throw new IllegalArgumentException("Tip necunoscut");
        }
    }
}
```

---

## Utilizare

```java
Fruct fruct = FructFactory.getFruct(TipFruct.MAR);
fruct.descriere();
```

---

## Avantaje

* separă logica de creare
* cod mai curat
* ușor de extins

---

## Dezavantaje

* fabrica trebuie modificată pentru fiecare tip nou

---

## Concluzie

Simple Factory este potrivit când există o singură familie de obiecte și se dorește centralizarea creării acestora.
