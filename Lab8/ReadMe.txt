Lab 8 - Ex3 - tutorial: https://abhiandroid.com/database/sqlite

activity_main.xml: EditText pentru introducere nume si parola 
Buton: salvare date introduse 
Buton: vizualizare date
EditText: introducere nume existent si nume nou
Buton: Update
EditText: introducere nume pentru stergere
Buton: Stergere

MainActivity.java: 
metoda onCreate: conectare activity_main.xml in Java
crearea metodelor aferente butoanelor:
*addUser pentru adaugare date (buton Add User)
*viewdata pentru vizualizare date existente (buton View Data)
*update pentru actualizarea datelor (buton Update)
*delete pentru stergere date (buton Delete)

myDbAdapter.java: 
*definirea functiilor care sunt utilizate pentru 
a efectua operatiile de inserare, actualizare si stergere a datelor in SQLite
*in plus, aceastã clasa creeaza o alta clasa care va extinde SQLiteOpenHelper

Message.java:adaugare toast pentru afisarea mesajului