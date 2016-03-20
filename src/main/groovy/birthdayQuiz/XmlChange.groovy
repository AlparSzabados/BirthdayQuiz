package birthdayQuiz

import static birthdayQuiz.XmlMaker.Status.FINISHED
import static birthdayQuiz.XmlReader.getEXERCISE_DONE

class XmlChange { // TODO unify reading and writing of config file
    static finishExercise(int id) {
        EXERCISE_DONE[id] = FINISHED
        /* TODO make it write it into the XML file */
    }
}
