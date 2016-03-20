package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import static birthdayQuiz.FolderHolder.CONFIG
import static birthdayQuiz.XmlMaker.Status.FINISHED
import static birthdayQuiz.XmlReader.EXERCISE_DONE
import static birthdayQuiz.XmlReader.config

class ExerciseCheck {
    static isExerciseFinished(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] == FINISHED
    }

    static finishExercise(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] = FINISHED
        config.writeTo(CONFIG)
    }
}
