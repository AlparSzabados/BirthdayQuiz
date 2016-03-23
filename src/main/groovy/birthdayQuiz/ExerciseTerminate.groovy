package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import static birthdayQuiz.FolderHolder.CONFIG
import static birthdayQuiz.XmlMaker.Status.FINISHED
import static birthdayQuiz.exercises.ExerciseRegistry.*
import static groovy.xml.XmlUtil.serialize

class ExerciseTerminate {
    static config = new XmlSlurper().parseText(CONFIG.text)

    private static exercises = config.exercises
    protected static final EXERCISE_DONE = [(_01): exercises._01,
                                            (_02): exercises._02,
                                            (_03): exercises._03,
                                            (_04): exercises._04,
                                            (_05): exercises._05,
                                            (_06): exercises._06,
                                            (_07): exercises._07,
                                            (_08): exercises._08,
                                            (_09): exercises._09,
                                            (_10): exercises._10,
                                            (_11): exercises._11]

    static isExerciseFinished(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] == FINISHED
    }

    static finishExercise(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] = FINISHED
        
        config.'**'.each {
            if (it.name() == ex.toString())
                it.replaceBody FINISHED
        }
        CONFIG.text = serialize(config)
    }
}
