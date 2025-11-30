# Chess-Game

♟️ Java Chess Game

    Un jeu d'échecs fonctionnel avec interface graphique, développé en Java dans le cadre d'un projet d'école d'ingénieur.

Ce projet met en œuvre les fondamentaux de la Programmation Orientée Objet (POO) pour recréer les mécaniques du jeu d'échecs. Il inclut la gestion du plateau, le calcul des déplacements valides, la détection de l'échec et une interface graphique interactive (Swing/AWT).

📋 Fonctionnalités

    Jeu complet à 2 joueurs (Local).

    Déplacements valides : Gestion des mouvements pour toutes les pièces (Pion, Tour, Cavalier, Fou, Reine, Roi).

    Aide visuelle : Surlignage en vert des cases accessibles lorsqu'une pièce est sélectionnée.

    Logique de jeu :

        Détection de l'état "Échec".

        Détection de la fin de partie (Roi bloqué / Échec et Mat).

        Interdiction des mouvements illégaux (collisions, sorties du plateau).

    Interface Graphique (GUI) :

        Plateau 8x8 avec gestion des clics.

        Utilisation de caractères Unicode pour l'affichage des pièces.

        Menu de réinitialisation de la partie.

🛠️ Architecture Technique

Le projet suit une structure modulaire séparant la logique du jeu de l'affichage.

Structure des fichiers

    Piece.java (Abstraite) : Classe mère définissant les propriétés communes (couleur, position) et la méthode abstraite isValidMove.

        Sous-classes : Pion, Tour, Cavalier, Fou, Reine, Roi.

    ChessBoard.java : Gère le tableau 2D (8x8), le placement initial des pièces et l'état de l'échiquier.

    ChessGame.java : Le cœur logique. Gère le tour par tour, vérifie les conditions d'échec (isInCheck) et valide les mouvements globaux.

    ChessGameGui.java : Gère l'affichage (fenêtre, redessin du plateau) et les interactions souris (MouseListener).

    ChessSquareComponent.java : Représente chaque case graphiquement (bouton, couleur de fond, symbole de la pièce).

🚀 Installation et Lancement

    Cloner le dépôt :
    Bash

git clone https://github.com/votre-username/java-chess-game.git
cd java-chess-game

Compiler le projet : Assurez-vous d'avoir le JDK installé.
Bash

javac *.java

Lancer le jeu :
Bash

    java ChessGameGui

⚠️ Limitations connues & Améliorations futures

Bien que le cœur du jeu soit fonctionnel, certaines règles avancées et cas limites restent à implémenter (voir section Rapport Innovation) :

    Coups spéciaux manquants : Le Roque (Castling), la Prise en passant et la Promotion du pion ne sont pas encore gérés.

    Validation stricte de l'échec : Actuellement, il est techniquement possible de bouger une pièce "clouée" (pinned) même si cela expose le roi à un échec (découverte).

    Condition de victoire : Le jeu détecte quand le roi est coincé, mais permet parfois de "manger" le roi au tour suivant au lieu d'arrêter la partie immédiatement sur l'échec et mat.

👥 Auteurs

Projet réalisé par Jules Le-Nezet et Théophile PASSET (ESME).

    Focus Jules : Gestion du plateau et logique globale.

    Focus Théophile : Logique des pièces et déplacements.

    Commun : Intégration des mouvements et Interface Graphique.
