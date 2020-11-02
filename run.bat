::Le script run.bat contient les commandes nécessaires pour l’exécution de l’application. Par exemple: 
set "path=%path%;C:\Program Files\Java\jdk-13.0.1\bin"
java -classpath bin store.gui.ProjectGUI 
:://l’option -classpath indique ou se trouvent les classes qui ont été créées auparavant par le compilateur, donc le répertoire bin 
:://store.gui.StoreGUI est le nom de la classe qui contient la méthode main, donc le point d’entrée dans le programme. Remarquez qu’on préfixe son nom par le nom complet de son package: store.gui  
::================================================================================== 