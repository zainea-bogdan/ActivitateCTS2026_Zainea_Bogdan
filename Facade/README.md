# Facade Pattern

## Ce este Facade?

Facade este un pattern structural care oferă o **interfață simplificată** pentru un subsistem complex format din mai multe clase. În loc ca apelantul să interacționeze direct cu fiecare clasă din subsistem, acesta folosește un singur punct de intrare — Facade-ul.

---

## Când îl recunoști?

> *"Personalul / utilizatorul nu trebuie să facă verificările separat, ci printr-un modul centralizat."*

Cuvinte cheie: **simplificare**, **modul unic**, **ascunderea complexității**, **acces unificat**.

---

## Reguli de implementare

1. Există un subsistem format din **mai multe clase independente**, fiecare cu responsabilități proprii

2. Clasa **Facade**:
    - conține instanțe ale claselor din subsistem (prin constructor sau inițializare internă)
    - expune o metodă publică simplă care orchestrează apelurile către subsistem
    - **nu adaugă logică de business nouă** — doar delegă

3. Apelantul (clientul) **nu cunoaște și nu interacționează direct** cu clasele subsistemului

---

## Structura generală

```
Client
  └──> FacadeClass
            ├──> ClassA
            ├──> ClassBf
            └──> ClassC
```

---

## Participanți

| Rol | Descriere |
|---|---|
| **Facade** | Clasa care simplifică accesul la subsistem |
| **Subsystem Classes** | Clasele complexe ascunse de Facade |
| **Client** | Apelează doar Facade-ul |

---

## Exemplu — Internare Pacient în Spital

### Problema

Pentru internarea unui pacient trebuie verificate **trei lucruri separate**:
- gravitatea stării pacientului (`Pacient`)
- confirmarea medicului că pacientul are trimitere (`Medic`)
- disponibilitatea unui pat liber (`Salon`)

Fără Facade, clientul (`s9.main.s10_recuperare.main.Main`) trebuie să orchestreze manual toate verificările:

```java
// ❌ Fără Facade — clientul gestionează totul manual
if (medic.areTrimitere(pacient)) {
    int patLiber = salon.getPatLiber();
    if (patLiber != -1) {
        System.out.println("Internat în patul " + patLiber);
        salon.ocupaPat(patLiber);
    }
}
```

### Soluția cu Facade

Clasa `ReceptieSpital` devine Facade-ul care ascunde această complexitate:

```java
// ReceptieSpital.java — Facade
public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        if (this.medic.areTrimitere(pacient)) {
            int patLiber = this.salon.getPatLiber();
            if (patLiber != -1) {
                System.out.println("Pacientul " + pacient.getNume() + " va fi internat in patul " + patLiber);
                salon.ocupaPat(patLiber);
            } else {
                System.out.println("Nu avem paturi libere, vei fi internat in alt salon");
            }
        } else {
            System.out.println("Ai nevoie de trimitere de la medic");
        }
    }
}
```

### Clasele din subsistem

```java
// Pacient.java — parte din subsistem
public class Pacient {
    private String nume;
    private int gravitate;
    // constructor + getters
}

// Medic.java — parte din subsistem
public class Medic {
    public boolean areTrimitere(Pacient pacient) {
        return pacient.getGravitate() > 5;
    }
}

// Salon.java — parte din subsistem
public class Salon {
    private boolean patLiber[] = new boolean[4];

    public int getPatLiber() { ... }
    public void ocupaPat(int indexPat) { ... }
}
```

---

## Utilizare

```java
// ✅ Cu Facade — clientul apelează un singur punct
Medic medic = new Medic();
Salon salon = new Salon();
ReceptieSpital receptie = new ReceptieSpital(medic, salon);

receptie.interneazaPacient(new Pacient("George", 2));
receptie.interneazaPacient(new Pacient("Dan", 7));
```

---

## Avantaje

* reduce cuplarea dintre client și subsistem
* simplifică utilizarea unor sisteme complexe
* un singur loc de modificat dacă logica de orchestrare se schimbă
* clientul nu trebuie să cunoască detaliile interne

---

## Dezavantaje

* Facade-ul poate deveni o clasă „god" dacă preia prea multă logică
* nu restricționează accesul direct la clasele subsistemului (spre deosebire de Proxy)

---

## Diferențe față de pattern-uri similare

| Pattern | Ce face |
|---|---|
| **Facade** | Simplifică accesul, nu adaugă funcționalitate |
| **Adapter** | Adaptează o interfață incompatibilă |
| **Proxy** | Controlează accesul cu condiții/permisiuni |
| **Decorator** | Adaugă funcționalitate nouă la runtime |

---

## Concluzie

Facade este util ori de câte ori mai multe clase trebuie orchestrate împreună pentru o operație, iar clientul **nu ar trebui să fie responsabil** de această orchestrare. Dacă simți că `s9.main.s10_recuperare.main.Main` face prea multe verificări în serie pentru a realiza o singură acțiune logică — e momentul pentru un Facade.