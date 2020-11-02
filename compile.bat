set "path=%path%;C:\Program Files\Java\jdk-13.0.1\bin"
::on indique ou se trouve le JDK avec lequel on veut travailler en affectant la variable d’environnement JAVA_HOME  
javac -d bin src\store\gui\*.java src\store\business\*.java
::on compile toutes les classes qui se trouvent dans les répertoires business, gui et util, en indiquant le chemin relatif par rapport au répertoire courant 
:: l’option -d indique l’endroit où sera placé le résultat de la compilation: dans notre cas, c’est le répertoire bin 
