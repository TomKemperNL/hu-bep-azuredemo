# Jersey op Azure

* Clone de repo
* Vanuit de IntelliJ Terminal (of een andere plek waar je mvn kan draaien): ``mvn com.microsoft.azure:azure-webapp-maven-plugin:2.5.0:config``
* Volg de wizard! 

## Gotchas
 
Het kan zijn dat de commandline wizard je niet toestaat een 'ouderwetsche' Tomcat 9 omgeving te kiezen, dan moet je 
eerst in de Azure GUI via je browser de web-app leeg aanmaken.

(Raar) In de IntelliJ terminal werkte de enter toets soms een beetje gek (1 enter telde dan voor 2 keuzes)... Ik ga er 
vanuit dat zulke bugs opgelost zijn tegen de tijd dat iemand dit leest.
(workaround is een commandline buiten intellij gebruiken)