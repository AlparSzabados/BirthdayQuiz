package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import static birthdayQuiz.FolderHolder.CONFIG
import static birthdayQuiz.XmlMaker.Status.FINISHED
import static birthdayQuiz.exercises.ExerciseRegistry.*
import static groovy.xml.XmlUtil.serialize

class ExerciseTerminate {
    static final CONFIG = new XmlSlurper().parseText(CONFIG.text)

    private static final EXERCISES = CONFIG.exercises
    protected static final EXERCISE_DONE = [(_01): EXERCISES._01,
                                            (_02): EXERCISES._02,
                                            (_03): EXERCISES._03,
                                            (_04): EXERCISES._04,
                                            (_05): EXERCISES._05,
                                            (_06): EXERCISES._06,
                                            (_07): EXERCISES._07,
                                            (_08): EXERCISES._08,
                                            (_09): EXERCISES._09,
                                            (_10): EXERCISES._10,
                                            (_11): EXERCISES._11]

    static isExerciseFinished(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] == FINISHED
    }

    static finishExercise(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] = FINISHED
        CONFIG."$ex".replaceBody(FINISHED)
        CONFIG.text = serialize(CONFIG)
    }
}
