package birthdayQuiz

import static birthdayQuiz.XmlMaker.Status.*
import static birthdayQuiz.XmlReader.*

class XmlChange {
    static finishExercise(int id) {
        EXERCISE_DONE[id] = FINISHED
        /* TODO make it write it into the XML file */
    }
}
