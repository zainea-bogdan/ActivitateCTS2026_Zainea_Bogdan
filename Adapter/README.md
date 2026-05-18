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
   - **Clasa utilizată** (interfața așteptată de client — sistemul intern)
   - **Clasa existentă** (clasa ce trebuie adaptată — din alt framework/sistem extern)

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
  └──> IGestionareComenzi (interfața cunoscută)
            └──> AdapterComenzi  ──> GestionareComenziExterna (din alt sistem)
```

---

## Participanți

| Rol | Clasă în exemplu | Descriere |
|---|---|---|
| **Interfața utilizată** | `IGestionareComenzi` | Interfața așteptată de client — sistemul intern |
| **Clasa internă** | `GestionareComenzInterna` | Implementează interfața — sistemul intern |
| **Clasa existentă** | `GestionareComenziExterna` | Clasa din sistemul extern ce trebuie adaptată |
| **Adapter** | `AdapterComenzi` / `AdapterClaseComenzi` | Clasa intermediară care face „traducerea" |
| **Client** | `Main` | Folosește doar interfața `IGestionareComenzi` |

---

## Clasele existente (incompatibile)

```java
// Interfața sistemului intern — cunoscută de client
public interface IGestionareComenzi {
    void prelucreazaComanda();
}
```

```java
// Sistemul intern — implementează interfața
public class GestionareComenzInterna implements IGestionareComenzi {
    private int idComanda;

    public GestionareComenzInterna(int idComanda) {
        this.idComanda = idComanda;
    }

    @Override
    public void prelucreazaComanda() {
        System.out.printf("A fost prelucrata Comanda cu id-ul: " + this.idComanda);
    }
}
```

```java
// Sistemul extern (Glovo) — clasa ce trebuie adaptată, cu metodă incompatibilă
public class GestionareComenziExterna {
    private String idComandaExtern;

    public GestionareComenziExterna(String idComandaExtern) {
        this.idComandaExtern = idComandaExtern;
    }

    public void manupulareComanda() {
        System.out.printf("A fost manipulata, pregatita si gata de livrare, comanda cu id-ul " + this.idComandaExtern);
    }
}
```

---

## Cele două variante de implementare

### 🔶 Adapter de Obiecte (prin compoziție) — ✅ Varianta recomandată în Java

Adapter-ul **implementează** interfața sistemului intern și **conține o instanță** a clasei externe.

```java
public class AdapterComenzi implements IGestionareComenzi {      // ← implementează interfața internă
    private GestionareComenziExterna referintaExterna;           // ← instanță a clasei externe

    public AdapterComenzi(GestionareComenziExterna referintaExterna) {
        this.referintaExterna = referintaExterna;                // ← primit prin constructor (dependency injection)
    }

    @Override
    public void prelucreazaComanda() {
        referintaExterna.manupulareComanda();                    // ← delegare prin instanță
    }
}
```

```
AdapterComenzi
    ├── implements  IGestionareComenzi       ← se conformează interfeței clientului
    └── has-a       GestionareComenziExterna ← conține clasa externă
```

---

### 🔷 Adapter de Clase (prin moștenire) — ⚠️ Problematic în Java

Adapter-ul **extinde** clasa externă și **implementează** interfața sistemului intern.

```java
public class AdapterClaseComenzi extends GestionareComenziExterna   // ← extinde clasa externă
                                  implements IGestionareComenzi {   // ← implementează interfața internă

    public AdapterClaseComenzi(String idComandaExtern) {
        super(idComandaExtern);                                      // ← inițializează părintele
    }

    @Override
    public void prelucreazaComanda() {
        manupulareComanda();                                         // ← apel direct prin moștenire
    }
}
```

```
AdapterClaseComenzi
    ├── extends     GestionareComenziExterna  ← moștenire din clasa externă
    └── implements  IGestionareComenzi        ← se conformează interfeței clientului
```

---

## Adapter de Clase vs. Adapter de Obiecte

| Criteriu | Adapter de Clase | Adapter de Obiecte |
|---|---|---|
| **Mecanism** | Moștenire (`extends`) | Compoziție (instanță ca atribut) |
| **Acces la metode externe** | Direct prin moștenire (`manupulareComanda()`) | Prin instanța deținută (`referinta.manupulareComanda()`) |
| **Flexibilitate** | ❌ Rigidă — fixată la compilare | ✅ Flexibilă — instanța poate fi schimbată |
| **Java** | ⚠️ Problematic (o singură moștenire) | ✅ Varianta recomandată |
| **Dependency Injection** | ❌ Nu | ✅ Da — instanța primită prin constructor |

> 💡 **Regula practică pentru Java**: folosește aproape întotdeauna **Adapter de Obiecte**.
> Moștenirea multiplă nu există în Java, iar compoziția oferă mai multă flexibilitate.

---

## Utilizare în Main

```java
public class Main {
    // clientul cunoaște doar IGestionareComenzi
    public static void proceseazaComanda(IGestionareComenzi gestionare) {
        gestionare.prelucreazaComanda();
    }

    public static void main(String[] args) {
        // sistemul intern — folosit direct
        GestionareComenzInterna interna = new GestionareComenzInterna(1);

        // sistemul extern — adaptat prin Adapter de Obiecte
        GestionareComenziExterna externa = new GestionareComenziExterna("GLV-99");
        AdapterComenzi adapter = new AdapterComenzi(externa);

        // sistemul extern — adaptat prin Adapter de Clase
        AdapterClaseComenzi adapterClase = new AdapterClaseComenzi("GLV-100");

        proceseazaComanda(interna);       // ✅ direct
        proceseazaComanda(adapter);       // ✅ prin adapter de obiecte
        proceseazaComanda(adapterClase);  // ✅ prin adapter de clase
    }
}
```

---

## Avantaje

* integrezi sisteme incompatibile fără a modifica codul existent
* respectă principiul Open/Closed — deschis pentru extensie, închis pentru modificare
* separare clară între sistemele integrate
* Adapter de Obiecte permite dependency injection — ușor de testat

## Dezavantaje

* adaugă un nivel extra de indirectare
* codul devine mai greu de urmărit dacă există mulți adapteri
* nu adaugă funcționalitate — dacă ai nevoie de funcționalitate nouă, folosește **Decorator**

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

Adapter este util ori de câte ori trebuie să faci două sisteme incompatibile să colaboreze.
În Java, **preferă întotdeauna Adapter de Obiecte** — este mai flexibil, mai ușor de testat și evită limitările moștenirii unice.

> Dacă simți că ai două clase care fac „același lucru" dar cu metode cu nume diferite și nu poți modifica niciuna — e momentul pentru un **Adapter**.