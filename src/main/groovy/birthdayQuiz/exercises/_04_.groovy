package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl

class _04_ { // TODO rename
    static String description = ''
    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex04', '.docx') == 2)
        if (success) {
            openUrl win1Gif
            openUrl task04Link
        } else {
            openUrl lose2Gif
        }
        success
    }
}