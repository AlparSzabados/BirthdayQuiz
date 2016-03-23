package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import java.time.MonthDay

class DateCheck {
    static isExerciseAllowed(ExerciseRegistry ex) {
        MonthDay.now() >= ex.start
    }
}
