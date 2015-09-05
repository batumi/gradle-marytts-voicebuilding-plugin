package de.dfki.mary.voicebuilding

class VoiceExtension {
    String name = 'my_voice'
    String gender = 'female'
    String domain = 'general'
    String language = 'en'
    String region = 'US'
    String type = 'unit selection'
    int samplingRate = 16000

    def nameCamelCase = {
        name?.split(/[^_A-Za-z0-9]/).collect { it.capitalize() }.join()
    }

    def locale = {
        locale ?: [language, region].join('_')
    }

    def localeXml = {
        [language, region].join('-')
    }

    def maryLocale = {
        language?.equalsIgnoreCase(region) ? language : locale
    }

    def maryLocaleXml = {
        language?.equalsIgnoreCase(region) ? language : localeXml
    }
}