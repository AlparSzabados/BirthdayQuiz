package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import static birthdayQuiz.ExerciseTerminate.*
import static birthdayQuiz.FolderHolder.CONFIG
import static birthdayQuiz.XmlMaker.Status.FINISHED
import static birthdayQuiz.XmlReader.EXERCISE_DONE
import static groovy.xml.XmlUtil.*

class ExerciseCheck {
    static isExerciseFinished(ExerciseRegistry ex) {
        EXERCISE_DONE[ex] == FINISHED
    }

    static finishExercise(ExerciseRegistry ex) {
        def config = new XmlSlurper().parseText(CONFIG.text)

        EXERCISE_TERMINATE.each { key, value ->
            if (key == (ex))
                config.'**'.findAll { if (it.name() == value) it.replaceBody FINISHED }
        }

        CONFIG.text = serialize(config)
    }
}
