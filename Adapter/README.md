# Adapter Pattern

## Ce este Adapter?

Adapter este un pattern structural care permite colaborarea dintre două clase cu **interfețe incompatibile**, fără a modifica niciuna dintre ele. Creează o clasă intermediară — Adapter-ul — care „traduce" apelurile dintr-o interfață în cealaltă.

---

## Când îl recunoști?

> *"Dorim să integrăm două sisteme / framework-uri diferite, fără să modificăm codul existent."*

Cuvinte cheie: **integrare**, **două sisteme incompatibile**, **fără modificarea claselor existente**, **wrapper**.

---

## Reguli de implementare

1. Există **două clase incompatibile** care trebuie să lucreze împreună:
    - **Clasa utilizată** (interfața așteptată de client)
    - **Clasa existentă** (clasa ce trebuie adaptată — din alt framework/sistem)

2. Se creează o clasă **Adapter** care:
    - se conformează interfeței clasei utilizate (prin `extends` sau `implements`)
    - conține sau moștenește clasa existentă
    - în metodele implementate, **delegă** apelurile către clasa existentă

3. Clientul folosește **doar interfața clasei utilizate** — nu știe că în spate rulează altceva

4. **Adapter-ul nu adaugă funcționalitate nouă** — doar face traducerea

---

## Structura generală

```
Client
  └──> ClasaUtilizata (interfața cunoscută)
            └──> AdapterClass  ──> ClasaExistenta (din alt sistem)
```

---

## Participanți

| Rol | Descriere |
|---|---|
| **Clasa utilizată** | Interfața / clasa așteptată de client |
| **Clasa existentă** | Clasa din sistemul extern ce trebuie adaptată |
| **Adapter** | Clasa intermediară care face „traducerea" |
| **Client** | Folosește doar interfața clasei utilizate |

---

## Cele două variante de implementare

### 🔷 Adapter de Clase (prin moștenire)

Adapter-ul **extinde** clasa existentă și **implementează** interfața clasei utilizate.

```java
// Adapter de clase — moștenire
public class AdaptorMedicament extends Medicament {         // ← extinde clasa existentă (spital)
    // moștenește direct metodele clasei existente

    @Override
    public void cumparaMedicament() {                       // ← implementează interfața farmaciei
        achizitioneazaMedicament();                         // ← apel direct prin moștenire (super)
    }
}
```

```
AdaptorMedicament
    ├── extends  Medicament (spital)   ← moștenire
    └── override cumparaMedicament()   ← interfața farmaciei
```

---

### 🔶 Adapter de Obiecte (prin compoziție)

Adapter-ul **extinde** clasa utilizată și **conține o instanță** a clasei existente.

```java
// Adapter de obiecte — compoziție (implementarea din cerință)
public class AdaptorMedicament extends s9.clase.farmacie.Medicament {   // ← extinde clasa utilizată
    private s9.clase.spital.Medicament medSpital;                       // ← instanță a clasei existente

    public AdaptorMedicament(s9.clase.spital.Medicament medSpital) {
        super(medSpital.getNume());
        this.medSpital = medSpital;
    }

    @Override
    public void cumparaMedicament() {
        medSpital.achizitioneazaMedicament();                           // ← delegare prin instanță
    }
}
```

```
AdaptorMedicament
    ├── extends  Medicament (farmacie)  ← se conformează interfeței clientului
    └── has-a    Medicament (spital)    ← conține clasa existentă
```

---

## Adapter de Clase vs. Adapter de Obiecte

| Criteriu | Adapter de Clase | Adapter de Obiecte |
|---|---|---|
| **Mecanism** | Moștenire (`extends`) | Compoziție (instanță ca atribut) |
| **Limbaje** | C++ (moștenire multiplă) | Java, C#, orice limbaj OOP |
| **Acces la metode** | Direct prin `super` | Prin instanța deținută |
| **Flexibilitate** | ❌ Rigidă — fixată la compilare | ✅ Flexibilă — instanța poate fi schimbată la runtime |
| **Suprascriere metode** | ✅ Poate suprascrie comportamente | ❌ Nu poate accesa metode `protected` |
| **Cuplare** | ⚠️ Mai strâns cuplat cu clasa existentă | ✅ Mai slab cuplat |
| **Java** | ⚠️ Problematic (o singură moștenire) | ✅ Varianta recomandată |

---

## Când alegi care variantă?

**Alege Adapter de Obiecte când:**
- lucrezi în Java sau C# (nu există moștenire multiplă)
- vrei să poți înlocui sau mocka clasa existentă ușor (ex: pentru teste)
- clasa existentă poate fi extinsă în mai multe feluri
- vrei cuplare mai slabă între Adapter și clasa existentă

**Alege Adapter de Clase când:**
- lucrezi în C++ și poți moșteni din ambele clase
- vrei să suprascrii comportamente din clasa existentă
- relația „este un" are sens semantic (Adapter-ul chiar este un tip al clasei existente)
- clasa existentă este `final` și nu poate fi extinsă — *în acest caz nici Adapter de Clase nu funcționează, deci Adapter de Obiecte este singura opțiune*

> 💡 **Regula practică pentru Java**: folosește aproape întotdeauna **Adapter de Obiecte**. Moștenirea multiplă nu există, iar compoziția oferă mai multă flexibilitate.

---

## Exemplu complet — Integrare Farmacie & Spital

### Problema

Farmacia are clasa `Medicament` cu metoda `cumparaMedicament()` (fără verificare rețetă).
Spitalul are clasa `Medicament` cu metoda `achizitioneazaMedicament()` (cu verificare rețetă).

Clientul (`Main`) cunoaște doar interfața farmaciei. Trebuie să poată folosi și medicamentele spitalului **fără să modifice nicio clasă existentă**.

### Clasele existente (incompatibile)

```java
// Farmacie — interfața cunoscută de client
package s9.clase.farmacie;

public class Medicament {
    private String nume;

    public Medicament(String nume) { this.nume = nume; }

    public void cumparaMedicament() {
        System.out.println("Medicament " + nume + " a fost cumparat.");
    }
}
```

```java
// Spital — clasa ce trebuie adaptată
package s9.clase.spital;

public class Medicament {
    private String nume;
    private float pret;

    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Medicament achizitionat");
        } else {
            System.out.println("Nu a prezentat reteta");
        }
    }

    public boolean prezintaReteta() {
        return this.nume.length() > 10;
    }
}
```

### Adapter-ul (Adapter de Obiecte)

```java
package s9.clase.adapter;

import s9.clase.farmacie.Medicament;

public class AdaptorMedicament extends Medicament {                  // ← interfața farmaciei
    private s9.clase.spital.Medicament medSpital;                   // ← instanța spitalului

    public AdaptorMedicament(s9.clase.spital.Medicament medSpital) {
        super(medSpital.getNume());
        this.medSpital = medSpital;
    }

    @Override
    public void cumparaMedicament() {
        medSpital.achizitioneazaMedicament();                       // ← traducere apel
    }
}
```

---

## Utilizare

```java
// Client — cunoaște doar interfața farmaciei
public static void procurareMedicament(Medicament medFarmacie) {
    medFarmacie.cumparaMedicament();
}

public static void main(String[] args) {
    s9.clase.spital.Medicament medSpital = new s9.clase.spital.Medicament("nurofen forte", 25.0f);
    Medicament medFarma = new Medicament("medtest");

    procurareMedicament(medFarma);                              // ✅ direct
    AdaptorMedicament adaptor = new AdaptorMedicament(medSpital);
    procurareMedicament(adaptor);                               // ✅ prin adapter
}
```

---

## Avantaje

* integrezi sisteme incompatibile fără a modifica codul existent
* respectă principiul Open/Closed — deschis pentru extensie, închis pentru modificare
* separare clară între sistemele integrate

---

## Dezavantaje

* adaugă un nivel extra de indirectare
* codul devine mai greu de urmărit dacă există mulți adapteri
* nu adaugă funcționalitate — dacă ai nevoie de funcționalitate nouă, folosește Decorator

---

## Diferențe față de pattern-uri similare

| Pattern | Ce face |
|---|---|
| **Adapter** | Traduce o interfață în alta, fără funcționalitate nouă |
| **Facade** | Simplifică accesul la un subsistem complex |
| **Decorator** | Adaugă funcționalitate nouă la runtime |
| **Proxy** | Controlează accesul cu condiții/permisiuni |

---

## Concluzie

Adapter este util ori de câte ori trebuie să faci două sisteme incompatibile să colaboreze. În Java, **preferă întotdeauna Adapter de Obiecte** — este mai flexibil, mai ușor de testat și evită limitările moștenirii unice. Dacă simți că ai două clase care fac „același lucru" dar cu metode cu nume diferite și nu poți modifica niciuna — e momentul pentru un Adapter.