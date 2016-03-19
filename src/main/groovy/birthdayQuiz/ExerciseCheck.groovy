package birthdayQuiz

import static birthdayQuiz.XmlMaker.Status.*
import static birthdayQuiz.XmlReader.*

class ExerciseCheck {
    static isExerciseFinished(int id) {
        EXERCISE_DONE[id] == FINISHED
    }
}

