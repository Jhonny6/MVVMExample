package com.rpapps.mvvmexample.model

class QuoteProvider {
    companion object {

        fun random():QuoteModel {
            val position : Int = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry",
                quoteAuthor = "lorem ipsum"
            ), QuoteModel(
                quote = "pe specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchange",
                quoteAuthor = "unchanged"
            ), QuoteModel(
                quote = "m Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia",
                quoteAuthor = "consectetur"
            ), QuoteModel(
                quote = " randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the ",
                quoteAuthor = "versions "
            ), QuoteModel(
                quote = "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for thos",
                quoteAuthor = "Renaissance"
            ), QuoteModel(
                quote = "sed words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't a",
                quoteAuthor = "section "
            ), QuoteModel(
                quote = "um generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It us",
                quoteAuthor = "sections "
            ), QuoteModel(
                quote = " consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10",
                quoteAuthor = "treatise "
            ), QuoteModel(
                quote = "e Latin words, consectetur, from a Lorem Ipsum passage, and going t",
                quoteAuthor = "dolor "
            ), QuoteModel(
                quote = "0.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise o",
                quoteAuthor = "Lorem "
            ), QuoteModel(
                quote = "of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The fir",
                quoteAuthor = "Ipsum "
            ), QuoteModel(
                quote = "tions of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomise",
                quoteAuthor = "generated "
            )
        )
    }
}