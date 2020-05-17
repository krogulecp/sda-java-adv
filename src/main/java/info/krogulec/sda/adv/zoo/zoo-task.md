#Zadanie - stworzenie zoo zgodnie z wytycznymi

1. Naszym zadaniem będzie stworzenie aplikacji, która będzie
   modelowała zoo. Będziemy krok po kroku rozbudowywali
   aplikację o kolejne elementy, pamiętając o technikach i dobrych
   zasadach, których nauczyliśmy się do tej pory. Logikę aplikacji
   będziemy tworzyli korzystając z TDD.
   
2. Stwórz odpowiednią hierarchię zwierząt. Jako kierownicy zoo
   będziemy sprawdzali czy każde zwierzę (Animal) żyje oraz ważyli
   je od czasu do czasu w ramach rutynowych badań.
   
3. Niestety nie udało się nam otrzymać dofinansowania od UE na
   nowy startup, więc na razie w naszym zoo będą się znajdowały
   tylko niedźwiedzie (Bear). Na początek będą się tam znajdowały
   niedźwiedzie czarne (BlackBear), niedźwiedzie brunatne
   (BrownBear) i niedźwiedzie polarne (PolarBear).
   
4. Nasze niedźwiedzie to nietypowe zwierzęta i żeby sprawdzić czy
   żyją (isAlive) należy przypomnieć sobie ostatnią datę ich posiłku.
   Jeśli zwierzę jadło mniej niż 10 dni temu, to jest żywe.
   
5. Aby utrzymywać nasze niedźwiedzie przy życiu powinniśmy
   żywić nasze zwierzaki. Każdy niedźwiedź powinien mieć
   możliwość jedzenia (eat). Wystarczy, by metoda ustawiała czas posiłku na obecną datę.
  
6. Niedźwiedź czarny waży (getWeight) 50 kg, niedźwiedź
   brunatny - 100 kg, a polarny - 200 kg.
   Waga powinna być zwracana jako int.
   
   alt. Jak zwierze zjada posiłek to jego waga rośnie o jakąś wartość 
   - w przypadku niedźwiedzia - 1kg dla czarnego, 2kg dla brunatengo
    i 3 kg dla polarnego.
   
7. Oczywiście nasze zoo jest tylko wirtualne, więc musimy dodać
   możliwość oglądania naszych niedźwiedzi. Każdy z nich
   powinien mieć możliwośc wyświetlenia (display).
   Wystarczy, że metoda drukuje tekst identyfikująca miśka.
   
8. Dyrekcja zoo zauważyła, że małe dzieci nie są zainteresowane
   żywymi niedźwiedziami. Bardziej ciekawią je maskotki. W
   naszym zoo mają więc pojawić się pluszowe niedźwiedzie
   (TeddyBear).
   
9. Niedźwiedzie są niebezpiecznymi zwierzętami, które walczą o
   swoje jedzenie i mogą atakować swoje ofiary (attack). Brunatne i
   czarne niedźwiedzie tylko ranią swoje ofiary, a niedźwiedzie
   polarne - zabijają.
   Metody powinny zwracać odpowiedni tekst (String) jako wynik.
   
10. Dla każdej nowej funkcjonalności, którą dodamy w klasie
    głównej Bear będziemy musieli nadpisywać metody w klasach,
    które tej funkcjonalności nie obsługują, jak np. w pluszowym
    misiu. Zamiast tego moglibyśmy stworzyć interfejs, który
    dodajemy do odpowiednich klas i piszemy jego implementację.
    
11. Istnieje znacznie lepsze rozwiązanie zmniejszające duplikację
    kodu. Wyciągnijmy to co jest stałe od tego co się zmienia. Każdy
    niedźwiedź może atakować, ale robią to w inny sposób.
    Stwórzmy ogólną definicję ataku oraz jej konkretne
    implementacje.
    
12. Definiuje rodzinę algorytmów, enkapsulując każdy z nich oraz
    umożliwiając ich łatwą wymianę. Strategia umożliwia
    algorytmom zmienianie się bez konieczności zmiany klientów,
    którzy ich używają. 