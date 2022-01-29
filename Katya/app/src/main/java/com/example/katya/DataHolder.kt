package com.example.katya

import androidx.annotation.DrawableRes

data class Data(
    @DrawableRes val pictureRes: Int,
    val name: String,
    val surname: String,
    val minimalInfo: String,
    val details: DetailsData
) {

    data class DetailsData(
        val birthday: String,
        val country: String,
        val achievements: List<String>,
    )
}

object DataHolder {

    private var personsList: MutableList<Data> = mutableListOf()

    private val bjarneStroustrup = Data(
        pictureRes = R.drawable.bjarne_stroustrup,
        name = "Бьёрн",
        surname = "Страуструп",
        minimalInfo = "программист, автор языка программирования C++",
        details = Data.DetailsData(
            birthday = "30 декабря 1950",
            country = "Дания",
            achievements = listOf(
                "1993 — Премия имени Грейс Мюррей Хоппер, «за его ранние работы в области языка С++, базирующиеся на его разработках и внёсшие наибольшее влияние в языки программирования за всю историю вычислительной техники».",
                "2004 — Премия «Компьютерный предприниматель» от Компьютерного сообщества IEEE, «за начало разработки и коммерциализации объектно-ориентированной технологии создания программ и за большие изменения, внесённые в бизнес и индустрию».",
                "2005 — Премия Уильяма Проктера за научные достижения",
                "2015 — Премия Даля — Нюгора",
                "2015 — Fellow Awards",
                "2017 — Медаль Фарадея",
                "2018 — Пионер компьютерной техники",
                "2018 — Премия CBL",
                "2018 — Премия Дрейпера",
            ),
        ),
    )

    private val robertMartin = Data(
        pictureRes = R.drawable.robert_martin,
        name = "Роберт",
        surname = "Мартин",
        minimalInfo = "консультант и автор в области разработки ПО. Мартин является профессионалом в области разработки ПО с 1970, а с 1990 становится международным консультантом в этой области. В 2001 он организует встречу группы, которая создала гибкую методологию разработки из техник экстремального программирования",
        details = Data.DetailsData(
            birthday = "1952",
            country = "США",
            achievements = listOf(
                "Быстрая разработка программ. Принципы, примеры, практика. — Вильямс, 2004.",
                "Чистый код. Создание, анализ и рефакторинг. — Питер, 2012.",
                "Идеальный программист. Как стать профессионалом разработки ПО. — Питер, 2012.",
                "Принципы, паттерны и методики гибкой разработки на языке C#. — Символ-Плюс, 2011.",
                "Гибкая разработка программ на Java и C++. Принципы, паттерны и методики. — Диалектика, 2016.",
                "Чистая архитектура. Искусство разработки программного обеспечения. — Питер, 2018.",
                "Чистый Agile. Основы гибкости. — Питер, 2020.",
            ),
        ),
    )

    private val borisBabayan = Data(
        pictureRes = R.drawable.boris_babayan,
        name = "Бори́с",
        surname = "Бабая́н",
        minimalInfo = "советский и российский учёный, педагог, разработчик вычислительной техники",
        details = Data.DetailsData(
            birthday = "20 декабря 1933",
            country = "СССР, Россия",
            achievements = listOf(
                "Автор трудов по архитектурным принципам построения вычислительных комплексов, компьютерного программного обеспечения",
                "Лауреат Государственной (1974) и Ленинской (1987) премий",
                "Первый европейский учёный, удостоенный звания Intel Fellow",
                "ЭВМ 5Э92б",
                "МЦСТ",
            ),
        ),
    )

    val dataList = listOf(
        bjarneStroustrup,
        robertMartin,
        borisBabayan,
    )

    fun getAll(): MutableList<Data> {
        return personsList
    }

}