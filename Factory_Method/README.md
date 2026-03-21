# Factory Method Pattern

## Rules to identify it

* similar cu Simple Factory
* dacă există **mai multe familii de obiecte**, fiecare cu implementări proprii
* dacă nu mai este suficientă o singură fabrică centralizată
* crearea obiectelor este delegată către clase diferite (fabrici concrete)

---

## Cum se implementează

### Organizare pachete

* `main`
* `clase`

    * `familii_de_clase`
    * `fabrici`

---

### 1. Familii de clase

* în `familii_de_clase`:

    * interfață sau clasă abstractă (familia)
    * subpachete pentru fiecare familie

#### Exemplu structură:

```
familii_de_clase/
    transport_urban/
    transport_extraurban/
```

---

### Pentru fiecare familie:

* o interfață sau clasă abstractă
* cel puțin 2 clase concrete

```java
public interface Transport {
    void descriere();
}
```

```java
public class Autobuz implements Transport {
    public void descriere() {
        System.out.println("Autobuz urban");
    }
}
```

```java
public class Tramvai implements Transport {
    public void descriere() {
        System.out.println("Tramvai urban");
    }
}
```

---

### 2. Fabrici

* în pachetul `fabrici`:

    * o interfață de fabrică abstractă
    * câte o fabrică concretă pentru fiecare tip de obiect

```java
public interface TransportFactory {
    Transport createTransport();
}
```

---

### Fabrici concrete

```java
public class AutobuzFactory implements TransportFactory {
    public Transport createTransport() {
        return new Autobuz();
    }
}
```

```java
public class TramvaiFactory implements TransportFactory {
    public Transport createTransport() {
        return new Tramvai();
    }
}
```

---

### Despre enums

* faci o interfata comuna pentru ele
* si dupa faci cate un enum per fiecare familie cum ai invatat la seminar :)
---

## Utilizare

```java
TransportFactory factory = new AutobuzFactory();
Transport transport = factory.createTransport();
transport.descriere();
```

---

## Observații

* fiecare tip are propria fabrică
* extensia se face prin adăugarea unei noi fabrici
* nu modifici cod existent (Open/Closed Principle)

---

## Concluzie

Factory Method este folosit când există mai multe familii de obiecte și se dorește delegarea creării acestora către fabrici dedicate, evitând o logică centralizată.
