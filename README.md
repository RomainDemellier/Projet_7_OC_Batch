# Projet_7_OC_Batch

Ce Batch a été testé avec la version **8.5 de tomcat**.

Commencez par clonez le code de l'application en tapant en ligne de commande :
```
git clone https://github.com/RomainDemellier/Projet_7_OC_Batch.git
```

Pour builder l'application mettez vous sous la racine de l'application :
``` 
cd Projet_7_OC_Batch/projet_7_batch/
```
Ensuite tapez la commande suivante dans votre terminal :
```
mvn package
```
Il vous faut maintenant récupérer le fichier **projet_7_batch-0.0.1-SNAPSHOT.war**. Sous la racine de l'application il y a un dossier nommé **projet_7_batch**. Dans ce dossier se trouve un dossier nommé **target** dans lequel se trouve le fichier **projet_7_batch-0.0.1-SNAPSHOT.war**. Il vous faut copier ce fichier et le collez dans un dossier nommé **webapps**, celui dans lequel vous avez copier coller le fichier **projet_7-0.0.1-SNAPSHOT.war**. Ce dossier se trouve dans le dossier nommé **apache-tomcat**. Le nom de ce dossier peut varier selon les versions.

Pour continuer rendez vous sur la page https://github.com/RomainDemellier/Projet_7_OC_Front_Angular et suivez les instructions du README.md.
