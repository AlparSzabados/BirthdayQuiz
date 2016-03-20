package birthdayQuiz

import static birthdayQuiz.XmlMaker.Status.FINISHED
import static birthdayQuiz.XmlReader.getEXERCISE_DONE

class XmlChange {
    static finishExercise(int id) {
        EXERCISE_DONE[id] = FINISHED
        /* TODO make it write it into the XML file */
    }
}
