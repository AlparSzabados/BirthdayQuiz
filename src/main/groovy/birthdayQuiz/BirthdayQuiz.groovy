package birthdayQuiz

import static birthdayQuiz.DateCheck.isExerciseAllowed
import static birthdayQuiz.ExerciseCheck.finishExercise
import static birthdayQuiz.ExerciseCheck.isExerciseFinished
import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.getFolder
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.playerInput
import static birthdayQuiz.TextHolder.*
import static birthdayQuiz.UrlHolder.*
import static birthdayQuiz.XmlMaker.createXml
import static birthdayQuiz.exercises._07_TypoHunt.typoHunt

class BirthdayQuiz {
    static void main(String... args) {
        folder.mkdir()

        if (fileCount(folder, 'xml') == 0) {
            createXml()
        }

        if (isExerciseAllowed(1)) {
            println task1
            if (isExerciseFinished(1)) {
                println finishedMessage
            } else {
                printf(pictureCounter, fileCount(folder, 'jpg'))
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
            if (isExerciseFinished(2)) {
                println finishedMessage
            } else {
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
            if (isExerciseFinished(3)) {
                println finishedMessage;
            } else {
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
            if (isExerciseFinished(4)) {
                println finishedMessage
            } else {
                println pressEnter
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
            if (isExerciseFinished(5)) {
                finishedMessage
            } else {
                println pressEnter
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
            if (isExerciseFinished(6)) {
                finishedMessage
            } else {
                println pressEnter
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
            if (isExerciseFinished(7)) {
                finishedMessage
            } else {
                typoHunt(typos)
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
            if (isExerciseFinished(9)) {
                println finishedMessage
            } else {
                println pressEnter
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
            if (isExerciseFinished(10)) {
                println finishedMessage
            } else {
                println pressEnter
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
            if (isExerciseFinished(11)) {
                println finishedMessage
            } else {
                println pressEnter
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