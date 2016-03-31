package birthdayQuiz

import groovy.xml.MarkupBuilder

import static birthdayQuiz.FolderHolder.CONFIG
import static birthdayQuiz.XmlMaker.Status.NOT_FINISHED

class XmlMaker {
    enum Status {
        FINISHED, NOT_FINISHED
    }

    static createXml() {
        def sw = new StringWriter()
        new MarkupBuilder(sw).birthdayQuiz() {
            exercises() {
                _01(NOT_FINISHED)
                _02(NOT_FINISHED)
                _03(NOT_FINISHED)
                _04(NOT_FINISHED)
                _05(NOT_FINISHED)
                _06(NOT_FINISHED)
                _07(NOT_FINISHED)
                _08(NOT_FINISHED)
                _09(NOT_FINISHED)
                _10(NOT_FINISHED)
                _11(NOT_FINISHED)
            }
        }
        sw.write()
        CONFIG << sw
    }
}
