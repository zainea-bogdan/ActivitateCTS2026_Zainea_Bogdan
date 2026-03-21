# Singleton Pattern

## Ce este Singleton?

Singleton este un pattern de creare care asigură existența unei singure instanțe a unei clase și oferă un punct global de acces la aceasta.

---

## Reguli de implementare

1. Clasa conține:

    * atribute proprii
    * o instanță statică a clasei, inițializată cu `null`

2. Constructorul este `private` pentru a preveni instanțierea directă

3. Există o metodă statică `getInstance(...)`:

    * verifică dacă instanța este `null`
    * dacă este, o creează
    * altfel, returnează instanța existentă

4. Metoda `getInstance` poate fi `synchronized` pentru a asigura thread safety

---

## Exemplu

```java
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

## Utilizare

```java
Singleton s1 = Singleton.getInstance();
Singleton s2 = Singleton.getInstance();

// s1 și s2 sunt aceeași instanță
```

---

## Avantaje

* garantează o singură instanță
* oferă acces global controlat

---

## Dezavantaje

* poate introduce probleme în aplicații multi-thread dacă nu este implementat corect
* poate face testarea mai dificilă

---

## Concluzie

Singleton este util când este necesară o singură instanță globală, cum ar fi pentru configurări sau conexiuni partajate.
