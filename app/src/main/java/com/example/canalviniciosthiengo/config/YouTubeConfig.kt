package com.example.canalviniciosthiengo.config

/**
 * Classe que contem os principais dados estaticos de
 * configuracao de acesso a YouTube Data API e tambem
 * dados para acesso a recursos alternativos externos
 * do YouTube
 *
 * As classes internas ([Key], [Channel], [ApiV3] e [Notification])
 * e tambem rotulos de todos os companion object.
 * Estes estao presentes em codigo somente para
 * facilitar a leitura dele. Ou seja, em terms de
 * regras de sintaxe esses nao sao obrigatorios
 * */
abstract class YouTubeConfig {
    abstract class Channel {
        companion object{
            /**
             * Constante com identificador unico do canal.
             * Com esse ID é possivel
             * carregar da YouTube Data Api os dados do canal correto
             * */
            const val CHANNEL_ID = "UCG3gFuIkRF3PpNkRk3Wp6dw"

            /**
             * Constante com a URL do Canal
             * */
            const val CHANNEL_URL = "https://www.youtube.com/channel/" + CHANNEL_ID
        }
    }
}