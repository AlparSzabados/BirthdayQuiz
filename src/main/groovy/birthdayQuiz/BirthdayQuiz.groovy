package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import static birthdayQuiz.DateCheck.isExerciseAllowed
import static birthdayQuiz.ExerciseCheck.finishExercise
import static birthdayQuiz.ExerciseCheck.isExerciseFinished
import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.TextHolder.FAILED_MESSAGE
import static birthdayQuiz.TextHolder.FINISHED_MESSAGE
import static birthdayQuiz.XmlMaker.createXml

class BirthdayQuiz {
    static void main(String... args) {
        ROOT_FOLDER.mkdir()

        if (fileCount(ROOT_FOLDER, '', '.xml') == 0) {
            createXml()
        }

        println '''Gratulálok, hogy tuléltél 30 évet az életedből!
Sokan nem éltek ennél sokkal többett, pl. Mozart, Jézus, Miklós – a Dacia.
Születésnapod alkalmából egy élményt, egy kincskereső zarándokutat kapsz tőlem, a feleségedtől.
Az app mellett találsz egy readme file-t és egy Birthday Quiz foldert.
A readme-t nem szokták elolvasni az emberek, de te olvasd el mert ha nem használod jól a programot,
akkor fel fog robbanni a PC-d. A programozást Alpár végezte Lőrinc felügyeletével.
I wouldn’t mess with them if I were you… \n'''
        println '***********************************************************************************************************\n'

        for (ex in ExerciseRegistry) {
            if (isExerciseAllowed(ex)) {
                println ex.description
                if (isExerciseFinished(ex))
                    println FINISHED_MESSAGE
                else {
                    if (ex.run())
                        finishExercise(ex)
                    else
                        println FAILED_MESSAGE
                }
            }
        }

        def PICTURE_COUNTER = '\nYou have uploaded %s pictures with your friends. '
        def jpgCount = fileCount(ROOT_FOLDER, '', '.jpg')
        printf(PICTURE_COUNTER, jpgCount)

        if (jpgCount == 30) {
            println "YYYYEEEEEY, you have friends!"
        }
    }
}