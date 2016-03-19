package birthdayQuiz

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.getFolder

class TextHolder {
    static task1 = ''
    static task2 = ''
    static task3 = ''
    static task4 = ''
    static task5 = ''
    static task6 = ''
    static task7 = ''
    static task8 = ''
    static task9 = ''
    static task10 = ''
    static task11 = ''

    static finishedMessage = 'Kipipálva!'
    static failMessage = 'Ez nem sikerült, probald meg újra.'
    static firstTask = "${fileCount(folder, 'jpg')} képet töltöttél fel eddíg"
}
