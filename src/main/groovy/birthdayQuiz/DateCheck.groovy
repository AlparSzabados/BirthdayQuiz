package birthdayQuiz

import java.time.Month
import java.time.MonthDay

class DateCheck {
    static ALLOWED_DATES = [1 : MonthDay.of(Month.MARCH, 24),
                            2 : MonthDay.of(Month.MARCH, 29),
                            3 : MonthDay.of(Month.APRIL, 1),
                            4 : MonthDay.of(Month.APRIL, 6),
                            5 : MonthDay.of(Month.APRIL, 11),
                            6 : MonthDay.of(Month.APRIL, 15),
                            7 : MonthDay.of(Month.APRIL, 22),
                            8 : MonthDay.of(Month.APRIL, 26),
                            9 : MonthDay.of(Month.MAY, 2),
                            10: MonthDay.of(Month.MAY, 6),
                            11: MonthDay.of(Month.MAY, 11)]

    static isExerciseAllowed(int id) {
        def startDate = ALLOWED_DATES[id]
        startDate && (MonthDay.now() >= startDate)
    }
}
