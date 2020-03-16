Proiectul 1: exercitiile 0-8 (afisare liniara)

-activity_main.xml: text, buton, lista itemilor

-list_item.xml: imagine si text pentru itemi

-MainActivity: creare 2 clase; 
metoda onCreate:conectare activity_main.xml in Java, initializare 
obiect carAdapter, setare in lista de masini: carAdapter, 
in carAdapter adaugare 4 masini prin functia
addCar, setare onClickListener pentru buton astfel incat 
la apasare sa preia textul din editText(activity_main.xml) si sa
adauge o noua masina in carAdapter.

-CarAdapter: declarare obiect de tip Activity si un ArrayList
metode getCount(), getItem(int i), getItemId(int i), getView - modificata
astfel incat sa fie eficienta (cf.curs) -> conectare list_item.xml in Java.


Proiectul 2: exercitiul 9

ex1: afisarea listei in Grids
-activity_main.xml: creare Gridview (3 coloane)
-activity_gridview.xml: imagine pentru itemi
-MainActivity: adaugare imagini pentru lista animals; metoda onCreate
-CustomAdapter: declarare obiect de tip Context si lista animals;
metode getCount(), getItem(int i), getItemId(int i), getView

Concluzie: 
-proiectul 1: BaseAdapter pentru a afisa lista dintr-un ListView 
-proiectul 2: utilizare a BaseAdapter in Gridview



