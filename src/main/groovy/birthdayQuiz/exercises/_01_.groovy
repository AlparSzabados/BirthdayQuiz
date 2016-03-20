package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl

class _01_ { // TODO rename
    static final PICTURE_COUNTER = 'You have uploaded %s pictures.'

    static String description = 'Upload some pictured, dude!' // TODO
    static Closure<Boolean> run = {
        def jpgCount = fileCount(ROOT_FOLDER, 'Ex01', '.jpg')
        printf(PICTURE_COUNTER, jpgCount)
        openUrl task01Link // TODO

        def success = (jpgCount == 30)
        if (success) {
            openUrl win1Gif
        }
        success
    }
}