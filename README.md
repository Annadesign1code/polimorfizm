# Polimorfizm i wzorzec Adapter w Javie

Ten projekt to prosty przykład w Javie, pokazujący polimorfizm oraz wzorzec projektowy Adapter.

## Opis projektu

Aplikacja definiuje wspólny interfejs `Odtwarzacz` z metodami `odtwarzaj()` oraz `zatrzymaj()` i implementuje go dla:

- `MP3Player` – odtwarzacz MP3
- `CDPlayer` – odtwarzacz płyt CD
- `KatarynkaAdapter` – adapter, który udostępnia działanie klasycznej `Katarynka` jako `Odtwarzacz`

Projekt demonstruje również użycie wzorca Adapter, aby niekompatybilny typ `Katarynka` mógł być użyty w miejscu, w którym oczekiwany jest `Odtwarzacz`.

## Struktura projektu

- `src/main/java/org/example/Odtwarzacz.java` – interfejs odtwarzacza
- `src/main/java/org/example/MP3Player.java` – implementacja odtwarzacza MP3
- `src/main/java/org/example/CDPlayer.java` – implementacja odtwarzacza CD
- `src/main/java/org/example/Katarynka.java` – klasa reprezentująca klasyczną katarynkę
- `src/main/java/org/example/KatarynkaAdapter.java` – adapter dla katarynki
- `src/main/java/org/example/Main.java` – prosta konsolowa aplikacja z menu wyboru

## Wymagania

- Java 26 (określona w `pom.xml`)
- Maven

## Budowanie

W katalogu głównym projektu uruchom:

```powershell
mvn compile
```

## Uruchamianie

Aplikację można uruchomić z IDE, otwierając klasę `org.example.Main`.

### Uwaga

Obecnie klasa `Main` używa metody `static void main()` zamiast standardowego podpisu `public static void main(String[] args)`. Aby uruchomić projekt z linii poleceń, zmień sygnaturę metody na standardową.

## Jak to działa

Aplikacja wyświetla menu, w którym można wybrać urządzenie do odtwarzania:

- `MP3Player`
- `CDPlayer`
- `Katarynka` przez adapter
- rozpoczęcie odtwarzania
- zatrzymanie

Dzięki Adapterowi można użyć klasy `Katarynka` bez zmiany jej oryginalnego interfejsu.

## Licencja

Projekt nie zawiera wyraźnie zadeklarowanej licencji w tym repozytorium.
