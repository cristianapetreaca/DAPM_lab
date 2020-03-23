Lab6: SharedPreferences

MainActivity:creare obiect de tip SharedPreferences
metoda onCreate:conectare activity_main.xml in Java, metoda onClick: pentru butonul [save] 
(stringul introdus in EditText este salvat in SharedPreference prin metoda save)
metoda voirAct2 pentru butonul [go to the second activity] (prin intent se porneste a doua activitate)
In a doua activitate: afisare "Passage vers la deuxieme activite" prin Toast


activity_main.xml:EdiText, 2 butoane (Save->avand functia din onCreate/Go to the second activity->avand functia voirAct2) si TextView
Pentru butonul de [save] am folosit ca background o imagine(din drawable) iar pentru cel de [go to the second activity] o culoare. 
Culoare de fundal


MySharedPreference: initializare SharedPreferences in constructor
metode save(): punerea stringului dat in editor, getValue(): ia stringul din Shared Preferences si il returneaza, 
clearSharedPreferences(): sterge toate valorile 


SecondActivity: creare obiect de tip SharedPreferences
metoda onCreate:conectare activity_second.xml in Java; getValue pentru a lua stringul salvat, afisare string prin setText intr-un textView
(initializare MySharedPreference si setarea valorii din textView cu stringul din sharedPreference)


activity_second.xml: TextView
Culoare de fundal 

AndroidManifest: adaugare SecondActivity