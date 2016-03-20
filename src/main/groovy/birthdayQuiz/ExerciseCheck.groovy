package birthdayQuiz

import static birthdayQuiz.XmlMaker.Status.FINISHED
import static birthdayQuiz.XmlReader.EXERCISE_DONE

class ExerciseCheck {
    static isExerciseFinished(int id) {
        EXERCISE_DONE[id] == FINISHED
    }

    static finishExercise(int id) {
        EXERCISE_DONE[id] = FINISHED
        /* TODO make it write it into the XML file */
    }
}
