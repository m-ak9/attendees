# attendees
L'objectif de ce TP est de concevoir un outil de reporting pour générer les présences, retard et absences des élèves à cours distanciel du Teams

- Un cours est représenté par : 
    - un nom (exemple: 'cours de maths', 'cours de scm', etc.)
    - une heure de début
    - une heure de fin


- Une connexion sur Teams a:
    - une heure de début
    - une heure de fin

- Une connexion peut :
    - donner sa durée en minutes
    - être bornée à la durée du cours
    - être comparé à une autre connexion


- Un élève a :
    - un nom
    - une liste de connexions sur Teams (un élève peut se connecter et déconnecter plusieurs fois pendant un cours. Par ex, en cas de problème de réseau)
- Un élève peut :
    - se connecter à Teams
    - dire s'il était en retard (il est arrivé 10 minutes après le début du cours)
    - dire s'il était absent (il est resté connecté moins de 15 minutes pendant le cours)
    - donner le temps en minutes qu'il a passé connecté durant le cours


## Avant de commencer

Vous créerez impérativement un commit à la fin de chaque exercice.
Pour créer un commit :
```
git add .
git commit -m "exercice N"
```

Pour les horaires, utiliser la classe `LocalTime` qui possède un ensemble de fonctions utiles pour la manipulation du temps (notamment les fonctions `until`, `isBefore`, `isAfter).

On peut créer un objet `LocalTime` avec la méthode `of` : LocalTime now = LocalTime.of(14, 0, 0)`
Un test doit comporter au moins une assertion pour être valide (sans assertion, un test n'a aucune valeur')

** Vous devez faire les exercices dans l'ordre établi : chaque exercice dépend du précédent **




## Exercice 1 : Créer la classe Session représentant un cours

- 1.1. Créer une classe nommée Session
- 1.2. Ajouter les champs:
    - name (le nom du cours)
    - start (l'heure de début du cours)
    - end (l'heure de fin du cours)
- 1.3. Ajouter les méthodes:
    - startAt() qui donne l'heure de début
    - endAt() qui donne l'heure de fin
- 1.4. Si je me trompe dans les horaires et que j'inverse l'heure de début et l'heure de fin, la classe Session doit le remettre dans le bon ordre
- 1.5. Ecrire les tests du fichier SessionTest.java


## Exercice 2 : créer la classe Attendance représentant la précense d'un éléève

- 2.1. Créer une classe nommée Attendance
- 2.2. Ajouter les champs représentant l'heure de connexion et l'heure de déconnexion
- 2.3. Ajouter les méthodes:
    - duration qui retourne la durée de la connexion en minutes
        - Utiliser la méthode until de LocalTime dont le premier paramètre est un autre LocalTime et le second est une unité de temps (utiliser ChronoUnit.MINUTES)
        - Les tests 1 et 2 du fichier AttendanceTest.java peuvent vous aider à définir le comportement de la méthode
    - bounded qui retourne une nouvelle instance de Attendance dont les heures de début et de fin seront bornées dans la plage horaire du cours donné en paramètre
        - Les test 3 et 4 du fichier AttendanceTest.java peuvent vous aider à définir le comportement de la méthode
    - la méthode `override boolean equals(Object other){}` (venant de la classe Object dont toutes les classes héritent implicitement) qui retourne vrai si deux Attendance sont égales
        - `equals` prend un `Object` en paramètre. Pour le convertir en `Attendence`: `Attendence otherAttendence = (Attendence) other;`
- 2.4. Ecrire les tests du fichier AttendanceTest.java


## Exercice 3 : créer la classe Attendee représentant un élève et ses précences

- 3.1. Créer une classe nommée Attendee
- 3.2. Ajouter les propriétés de la classe conformément à l'énoncé
- 3.3. Ajouter les méthodes :
    - timeSpent qui donne le temps en minutes passé pendant le cours donné
    - wasLate qui indique si oui ou non, l'élève est arrivé en retard au cours donné
    - wasAbsent qui indique si oui ou non, l'élève était absent au cours donné
- 3.4. Ecrire les tests du fichier AttendeeTest.java


## Exercice 4 : Améliorer les tests

Imaginons que nous voulions, dans un prochain TP, ajouter la date en plus de l'heure d'un cours et ajouter la promo d'un élève.
Les tests de l'exercice 3 vont devoir être réécrits pour être conforme aux modifications.

L'objectif de cet exercice est d'écrire les tests de façon à limiter l'impact des changements de code sur les tests

- 4.1. Remplir les méthodes du fichier AttendeeTestHelper.java de façon à ce que les tests du fichier AttendeeTestGherkin 1 à 3 passent
- 4.2. Ecrire les tests restant sous leur nouvelle forme
