package birthdayQuiz

import birthdayQuiz.exercises.ExerciseRegistry

import java.time.MonthDay

import static birthdayQuiz.exercises.ExerciseRegistry.*
import static java.time.Month.*

class DateCheck {
    static ALLOWED_DATES = [(_01): MonthDay.of(MARCH, 24),
                            (_02): MonthDay.of(MARCH, 29),
                            (_03): MonthDay.of(APRIL, 1),
                            (_04): MonthDay.of(APRIL, 6),
                            (_05): MonthDay.of(APRIL, 11),
                            (_06): MonthDay.of(APRIL, 15),
                            (_07): MonthDay.of(APRIL, 22),
                            (_08): MonthDay.of(APRIL, 26),
                            (_09): MonthDay.of(MAY, 2),
                            (_10): MonthDay.of(MAY, 6),
                            (_11): MonthDay.of(MAY, 11)]

    static isExerciseAllowed(ExerciseRegistry ex) {
        def startDate = ALLOWED_DATES[ex]
        MonthDay.now() >= startDate
    }
}
