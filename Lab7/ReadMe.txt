Lab7: Fragments
Ex1:Voice Capabilities

MainActivity.java: 
*metoda onCreate:conectare activity_main.xml in Java
*la apasarea butonului [Tap to open mic] (button1), mesajul vocal va fi convertit in text si va fi afisat pe ecran
Folosirea metodei display():Actiune se face prin RecognizerIntent (care solicită introducerea vorbirii si 
apoi il trimite prin intermediul unui recunoscător de vorbire prin ACTION_RECOGNIZE_SPEECH).
Folosirea metodei onActivityResult():Dacă codul de solicitare este REQ_CODE_SPEECH_INPUT, atunci textul corespunzător este 
scris în ecranul de iesire. 
*la apasarea butonului [Listen it] (button), mesajul scris pe ecran va fi convertit in mesaj vocal  (folosirea metodei speak() )

activity_main.xml:
*buton button pentru [Listen it]: stilizare (bold, culoare background si culoare text)
*buton button1 pentru [Tap to open mic]: stilizare (culoare background si culoare text)
*TextView TextView pentru afisarea mesajului convertit din mesajul vocal: stilizare (culoare background)



Ex2: Android Fragments Example

*activity_main.xml: doua butoane diferite în linia principală LinearLayout si un fragment folosind eticheta <fragment>
*doua clase diferite pentru Fragments (FragmentOne si FragmnetTwo), ambele avand extends Fragment 
*layouts pentru Fragments (fragment_one.xml si fragment_two.xml)
*MainActivity.java: afisam cele două butoane de pe ecran si cand este apasat butonul corespunzător, se va afisa fragmentul respectiv.

Info: 
*pe emulator nu mergea microfonul
*video-ul pentru ex2 e in FragmentsTest
