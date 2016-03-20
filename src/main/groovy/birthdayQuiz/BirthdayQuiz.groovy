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
    }
}