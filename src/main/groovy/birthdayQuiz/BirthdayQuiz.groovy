package birthdayQuiz

import static birthdayQuiz.ExerciseCheck.*
import static birthdayQuiz.ExerciseCheck.*
import static birthdayQuiz.FolderHolder.*
import static birthdayQuiz.FileCounter.*
import static birthdayQuiz.PlayerInput.*
import static birthdayQuiz.TextHolder.*
import static birthdayQuiz.DateCheck.*
import static birthdayQuiz.UrlHolder.*
import static birthdayQuiz.TypoHunt.*
import static birthdayQuiz.XmlMaker.*
import static birthdayQuiz.OpenUrl.*

class BirthdayQuiz {
    static void main(String... args) {
        folder.mkdir()

        if (fileCount(folder, 'xml') == 0) {
            createXml()
        }

        if (isExerciseAllowed(1)) {
            println task1
            switch (isExerciseFinished(1)) {
                case true: println finishedMessage
                case false: printf (pictureCounter, fileCount(folder, 'jpg'))
                    openUrl task1Link
                    finishExercise(1)
                    if (fileCount(folder, 'jpg') == 30) {
                        openUrl win1Gif
                        println finishedMessage
                    }
            }
        }

        /* Second exercise */
        if (isExerciseAllowed(2)) {
            println task2
            switch (isExerciseFinished(2)) {
                case true: println finishedMessage
                case false:
                    println pressEnter
                    playerInput()
                    if (fileCount(folder, 'docx') == 1) {
                        openUrl win2Gif
                        openUrl task2Link
                        finishExercise(2)
                    } else {
                        println failMessage
                        openUrl lose1Gif
                    }
            }
        }

        /* Third exercise */
        if (isExerciseAllowed(3)) {
            println task3
            switch (isExerciseFinished(3)) {
                case true: println finishedMessage;
                case false:
                    openUrl task3Link
                    openUrl virusTab1
                    openUrl virusTab2
                    openUrl virusTab3
                    openUrl virusTab4
                    openUrl virusTab5
                    openUrl virusTab6
                    openUrl virusTab7
                    openUrl virusTab8
                    finishExercise(3)
            }
        }

        /* Fourth exercise */
        if (isExerciseAllowed(4)) {
            println task4
            switch (isExerciseFinished(4)) {
                case true: println finishedMessage
                case false: println pressEnter
                    playerInput()
                    if (fileCount(folder, 'docx') == 2) {
                        openUrl win1Gif
                        openUrl task4Link
                        finishExercise(4)
                    } else {
                        println failMessage
                        openUrl lose2Gif
                    }
            }
        }

        /* Fifth exercise */
        if (isExerciseAllowed(5)) {
            println task5
            switch (isExerciseFinished(5)) {
                case true: finishedMessage
                case false: println pressEnter
                    playerInput()
                    if (fileCount(folder, 'jpeg') == 1) {
                        openUrl win3Gif
                        openUrl task5Link
                        finishExercise(5)
                    } else {
                        println failMessage
                        openUrl lose3Gif
                    }
            }
        }

        /*Sixth exercise */
        if (isExerciseAllowed(6)) {
            println task6
            switch (isExerciseFinished(6)) {
                case true: finishedMessage
                case false: println pressEnter
                    playerInput()
                    if (fileCount(folder, 'docx') == 3) {
                        openUrl win3Gif
                        openUrl task6Link
                        finishExercise(6)
                    } else {
                        openUrl lose3Gif
                        println failMessage
                    }
            }
        }

        /* Seventh exercise */
        if (isExerciseAllowed(7)) {
            println task6
            switch (isExerciseFinished(7)) {
                case true: finishedMessage
                case false: typoHunt(typos)
                    openUrl win2Gif
                    openUrl task7Link
                    finishExercise(7)
            }
        }

//        /* Eight exercise */
//        if (isExerciseAllowed(8)) {
//            println "Akasztofa"
//            // TODO make hangman game
//            openUrl exercise8
//        }
//
        /* Ninth exercise */
        if (isExerciseAllowed(9)) {
            println task9
            switch (isExerciseFinished(9)) {
                case true: println finishedMessage
                case false: println pressEnter
                    if (playerInput() == code) {
                        openUrl win2Gif
                        openUrl task9Link
                        finishExercise(9)
                    } else {
                        openUrl lose2Gif
                        println failMessage
                    }
            }
        }

        /* Tenth exercise */
        if (isExerciseAllowed(10)) {
            println task10
            switch (isExerciseFinished(10)) {
                case true: println finishedMessage
                case false: println pressEnter
                    playerInput()
                    if (fileCount(folder, 'jpeg') == 2) {
                        openUrl win1Gif
                        openUrl task10Link
                        finishExercise(10)
                    } else {
                        openUrl lose2Gif
                        println failMessage
                    }
            }
        }

        /* Eleventh exercise */
        if (isExerciseAllowed(11)) {
            println task11
            switch (isExerciseFinished(11)) {
                case true: println finishedMessage
                case false: println pressEnter
                    playerInput()
                    if (fileCount(folder, 'jpeg') == 3) {
                        openUrl win3Gif
                        openUrl task11Link
                        finishExercise(11)
                    } else {
                        openUrl lose1Gif
                        println failMessage
                    }
            }
        }
    }
}