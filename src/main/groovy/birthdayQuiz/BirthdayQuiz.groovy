package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import static birthdayQuiz.DateCheck.isExerciseAllowed
import static birthdayQuiz.ExerciseTerminate.finishExercise
import static birthdayQuiz.ExerciseTerminate.isExerciseFinished
import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.PlayerInput.readLowercase
import static birthdayQuiz.TextHolder.FAILED_MESSAGE
import static birthdayQuiz.TextHolder.FINISHED_MESSAGE

class BirthdayQuiz {
    static void main(String... args) {
        ROOT_FOLDER.mkdir()

        if (fileCount(ROOT_FOLDER, '', '.xml') == 0) {
            XmlMaker.createXml()
        }

        println '''Gratulálok, hogy tuléltél 30 évet az életedből!
Sokan nem éltek ennél sokkal többett, pl. Mozart, Jézus, Miklós – a Dacia.
Születésnapod alkalmából egy élményt, egy kincskereső zarándokutat kapsz tőlem, a feleségedtől.
Az app mellett találsz egy readme file-t és egy Birthday Quiz foldert.
A readme-t nem szokták elolvasni az emberek, de te olvasd el mert ha nem használod jól a programot,
akkor fel fog robbanni a PC-d. A programozást Alpár végezte Lőrinc felügyeletével.
I wouldn’t mess with them if I were you…
'''
        println '*****************************************************************************************************\n'

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

        def jpgCount = fileCount(ROOT_FOLDER, 'Ex01', '.jpg')
        printf('\nEddíg %s kép található a mappádban. ', jpgCount)
        if (jpgCount == 30) {
            println "Nahát! Mégis vannak barátaid"
        }

        readLowercase()
    }
}