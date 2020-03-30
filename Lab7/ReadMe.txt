Lab7: Fragments
Ex1:Voice Capabilities

MainActivity.java: 
*metoda onCreate:conectare activity_main.xml in Java
*la apasarea butonului [Tap to open mic] (button1), mesajul vocal va fi convertit in text si va fi afisat pe ecran
Folosirea metodei display():Actiune se face prin RecognizerIntent (care solicitã introducerea vorbirii si 
apoi il trimite prin intermediul unui recunoscãtor de vorbire prin ACTION_RECOGNIZE_SPEECH).
Folosirea metodei onActivityResult():Dacã codul de solicitare este REQ_CODE_SPEECH_INPUT, atunci textul corespunzãtor este 
scris în ecranul de iesire. 
*la apasarea butonului [Listen it] (button), mesajul scris pe ecran va fi convertit in mesaj vocal  (folosirea metodei speak() )

activity_main.xml:
*buton button pentru [Listen it]: stilizare (bold, culoare background si culoare text)
*buton button1 pentru [Tap to open mic]: stilizare (culoare background si culoare text)
*TextView TextView pentru afisarea mesajului convertit din mesajul vocal: stilizare (culoare background)



Ex2: Android Fragments Example

*activity_main.xml: doua butoane diferite în linia principalã LinearLayout si un fragment folosind eticheta <fragment>
*doua clase diferite pentru Fragments (FragmentOne si FragmnetTwo), ambele avand extends Fragment 
*layouts pentru Fragments (fragment_one.xml si fragment_two.xml)
*MainActivity.java: afisam cele douã butoane de pe ecran si cand este apasat butonul corespunzãtor, se va afisa fragmentul respectiv