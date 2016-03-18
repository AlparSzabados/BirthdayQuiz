package birthdayQuiz

import static birthdayQuiz.DateCheck.*
import static birthdayQuiz.FileCounter.*
import static UrlHolder.*
import static birthdayQuiz.OpenUrl.*
import static birthdayQuiz.PlayerInput.*

class BirthdayQuiz {
    static void main(String... args) {
        File folder = new File("C:\\NewFolder")


        /* First exercise */
        if (isExerciseAllowed(1)) {
            println 'Találkozz 30 baráttal...'
            println "${fileCount(folder, 'jpg')} képet töltöttél fel eddíg"
            openUrl exercise1
            if (fileCount(folder, 'jpg') == 30) {
                println "Check!"
                openUrl win1
            }
        }

        /* Second exercise */
        if (isExerciseAllowed(2)) {
            println "Fejtsd meg a szöveget"
            println "(Press ENTER when ready)"
            playerInput()
            if (fileCount(folder, 'docx') >= 1) {
                println "Check"
                openUrl win2
                openUrl exercise2
            }
        }

        /* Third exercise */
        if (isExerciseAllowed(3)) {
            openUrl virusTab1
            openUrl virusTab2
            openUrl virusTab3
            openUrl virusTab4
            openUrl virusTab5
            openUrl exercise3
            openUrl virusTab6
            openUrl virusTab7
            openUrl virusTab8
            // TODO add check program
        }

        /* Fourth exercise */
        if (isExerciseAllowed(4)) {
            println "Hidden objects"
            println "(Press ENTER when ready)"
            playerInput()
            if (fileCount(folder, 'docx') >= 2) {
                println "Check"
                openUrl win1
                openUrl exercise4
            }
        }

        /* Fifth exercise */
        if (isExerciseAllowed(5)) {
            println "Számos kifestő"
            println "(Press ENTER when ready)"
            playerInput()
            if (fileCount(folder, 'jpg') >= 0) {
                println "Check"
                openUrl win3
                openUrl exercise5
            }
        }

        /*Sixth exercise */
        if (isExerciseAllowed(6)) {
            println "Puzzle"
            println "(Press ENTER when ready)"
            playerInput()
            if (fileCount(folder, 'docx') >= 0) {
                println "Check"
                openUrl win3
                openUrl exercise6
            }
        }

        /* Seventh exercise */
        if (isExerciseAllowed(7)) {
            println "Typo hibák"
            playerInput()
            // TODO make a loop
            openUrl win2
            openUrl exercise7
        }

        /* Eight exercise */
        if (isExerciseAllowed(8)) {
            println "Akasztofa"
            // TODO make hangman game
            openUrl exercise8
        }

        /* Ninth exercise */
        if (isExerciseAllowed(9)) {
            println "lakásberendező"
            playerInput()
            openUrl win2
            openUrl exercise9
        }

        /* Tenth exercise */
        if (isExerciseAllowed(10)) {
            println "Plakát"
            if (fileCount(folder, 'jpg') >= 0) {
                println "Check"
                openUrl win1
                openUrl exercise10
            }
        }

        /* Eleventh exercise */
        if (isExerciseAllowed(11)) {
            println "Terkep"
            if (fileCount(folder, 'jpg') >= 0) {
                println "Check"
                openUrl win1
                openUrl win2
                openUrl win3
                openUrl exercise11
            }
        }
    }
}