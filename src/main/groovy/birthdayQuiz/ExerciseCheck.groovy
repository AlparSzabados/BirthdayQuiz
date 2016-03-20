package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import static birthdayQuiz.XmlMaker.Status.FINISHED
import static birthdayQuiz.XmlReader.EXERCISE_DONE

class ExerciseCheck {
    static isExerciseFinished(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] == FINISHED
    }

    static finishExercise(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] = FINISHED
        /* TODO make it write it into the XML file */
    }
}
