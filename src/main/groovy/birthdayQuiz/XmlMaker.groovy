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
                exercise01(NOT_FINISHED)
                exercise02(NOT_FINISHED)
                exercise03(NOT_FINISHED)
                exercise04(NOT_FINISHED)
                exercise05(NOT_FINISHED)
                exercise06(NOT_FINISHED)
                exercise07(NOT_FINISHED)
                exercise08(NOT_FINISHED)
                exercise09(NOT_FINISHED)
                exercise10(NOT_FINISHED)
                exercise11(NOT_FINISHED)
            }
        }
        sw.write()
        CONFIG << sw
    }
}
