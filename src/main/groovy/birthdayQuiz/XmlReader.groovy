package birthdayQuiz

import static birthdayQuiz.FolderHolder.CONFIG
import static birthdayQuiz.exercises.ExerciseRegistry.*

class XmlReader {
    static config = new XmlSlurper().parseText(CONFIG.text)

    private static exercises = config.exercises
    static final EXERCISE_DONE = [(_01): exercises.exercise01,
                                  (_02): exercises.exercise02,
                                  (_03): exercises.exercise03,
                                  (_04): exercises.exercise04,
                                  (_05): exercises.exercise05,
                                  (_06): exercises.exercise06,
                                  (_07): exercises.exercise07,
                                  (_08): exercises.exercise08,
                                  (_09): exercises.exercise09,
                                  (_10): exercises.exercise10,
                                  (_11): exercises.exercise11]
}