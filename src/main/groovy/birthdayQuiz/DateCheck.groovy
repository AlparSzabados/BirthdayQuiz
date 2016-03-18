package birthdayQuiz

import java.time.Month
import java.time.MonthDay

class DateCheck {
    static ALLOWED_DATES = [1: MonthDay.of(Month.MARCH, 13)]

    static isExerciseAllowed(int id) {
        def startDate = ALLOWED_DATES[id]
        startDate && (MonthDay.now() >= startDate)
    }
}
