package birthdayQuiz

import static birthdayQuiz.ExerciseCheck.*
import static birthdayQuiz.FolderHolder.*
import static birthdayQuiz.FileCounter.*
import static birthdayQuiz.PlayerInput.*
import static birthdayQuiz.DateCheck.*
import static birthdayQuiz.TextHolder.*
import static birthdayQuiz.XmlChange.*
import static birthdayQuiz.XmlMaker.*
import static birthdayQuiz.OpenUrl.*
import static UrlHolder.*

class BirthdayQuiz {
    static void main(String... args) {
        /* TODO make directory for Album */

        if (fileCount(folder, '.xml') == 0) {
            createXml()
        }

        /* First exercise */
        switch (isExerciseAllowed(1)) {
            case false: println task1
                switch (isExerciseFinished(1)) {
                    case true: println finishedMessage
                    case false: println firstTask
                                openUrl win1
                                openUrl exercise1;
                }
        }

        if (fileCount(folder, 'jpg') == 30) {
            finishExercise(1);
            println finishedMessage
        }

        /* Second exercise */
        if (isExerciseAllowed(2)) {
            if (isExerciseFinished(2)) {
                /* Do something */
            } else {
                /* Give exercise */
                playerInput()

                openUrl win2
                openUrl exercise2

                finishExercise(2)
            }
        }

        /* Third exercise */
        if (isExerciseAllowed(3)) {
            if (isExerciseFinished(3)) {
                /* Do something */
            } else {
                /* Give exercise */
                openUrl virusTab1
                openUrl virusTab2
                openUrl virusTab3
                openUrl virusTab4
                openUrl virusTab5
                openUrl exercise3
                openUrl virusTab6
                openUrl virusTab7
                openUrl virusTab8

                finishExercise(3)
            }
        }

        /* Fourth exercise */
        if (isExerciseAllowed(4)) {
            if (isExerciseFinished(4)) {
                /* Do something */
            } else {
                /* Give exercise */
                playerInput()

                openUrl win1
                openUrl exercise4

                finishExercise(4)
            }
        }

        /* Fifth exercise */
        if (isExerciseAllowed(5)) {
            if (isExerciseFinished(5)) {
                /* Do something */
            } else {
                /* Give exercise */
                playerInput()
                if (fileCount(folder, 'jpg') >= 0) {
                    /* TODO talk it over with the client */
                    openUrl win3
                    openUrl exercise5

                    finishExercise(5)
                }
            }
        }

        /*Sixth exercise */
        if (isExerciseAllowed(6)) {
            if (isExerciseFinished(6)) {
                /* Do something */
            } else {
                /* Give exercise */
                playerInput()
                if (fileCount(folder, 'docx') >= 0) {
                    /* TODO talk it over with the client */
                    openUrl win3
                    openUrl exercise6

                    finishExercise(6)
                }
            }
        }

        /* Seventh exercise */
        if (isExerciseAllowed(7)) {
            if (isExerciseFinished(7)) {
                /* Do something */
            } else {
                /* Give exercise */
                playerInput()
                // TODO make a loop
                openUrl win2
                openUrl exercise7

                finishExercise(7)
            }
        }
//
//        /* Eight exercise */
//        if (isExerciseAllowed(8)) {
//            println "Akasztofa"
//            // TODO make hangman game
//            openUrl exercise8
//        }
//
        /* Ninth exercise */
        if (isExerciseAllowed(9)) {
            if (isExerciseFinished(9)) {
                /* Do something */
            } else {
                /* Give exercise */
                playerInput()

                openUrl win2
                openUrl exercise9

                finishExercise(9)
            }
        }

        /* Tenth exercise */
        if (isExerciseAllowed(10)) {
            if (isExerciseFinished(10)) {
                /* Do something */
            } else {
                /* Give exercise */
                playerInput()
                if (fileCount(folder, 'jpg') >= 0) {

                    openUrl win1
                    openUrl exercise10

                    finishExercise(10)
                }
            }
        }

        /* Eleventh exercise */
        if (isExerciseAllowed(11)) {
            if (isExerciseFinished(11)) {
                /* Do something */
            } else {
                if (fileCount(folder, 'jpg') >= 0) {
                    /* Give exercise */
                    openUrl win1
                    openUrl win2
                    openUrl win3
                    openUrl exercise11

                    finishExercise(11)
                }
            }
        }
    }
}