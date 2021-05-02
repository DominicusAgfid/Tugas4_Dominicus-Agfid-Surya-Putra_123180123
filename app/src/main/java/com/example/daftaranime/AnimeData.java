package com.example.daftaranime;

import java.util.ArrayList;

public class AnimeData {
    private static String[] title = new String[]{
            "Fullmetal Alchemist",
            "Jujutsu Kaisen",
            "Natsume Yuujinchou",
            "Shingeki no Kyojin"
    };

    private static String[] genre = new String[]{
            "Action, Military, Adventure, Comedy, Drama, Magic, Fantasy, Shouneng",
            "Action, Demons, Supernatural, School, Shounen",
            "Slice of Life, Demons, Supernatural, Drama, Shoujo",
            "Action, Military, Mystery, Super Power, Drama, Fantasy, Shounen"
    };

    private static int[] thumbnail = new int[]{
            R.drawable.fab,
            R.drawable.jjk,
            R.drawable.nny,
            R.drawable.snk
    };

    private static String[] keterangan = new String[]{
            "Alchemy is bound by this Law of Equivalent Exchange—something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression—Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their orig",
            "Idly indulging in baseless paranormal activities with the Occult Club, high schooler Yuuji Itadori spends his days at either the clubroom or the hospital, where he visits his bedridden grandfather. However, this leisurely lifestyle soon takes a turn for the strange when he unknowingly encounters a cursed item. Triggering a chain of supernatural occurrences, Yuuji finds himself suddenly thrust into the world of Curses—dreadful beings formed from human malice and negativity—after swallowing the said item, revealed to be a finger belonging to the demon Sukuna Ryoumen, the King of Curses.",
            "While most fifteen-year-old boys, in one way or another, harbor secrets that are related to girls, Takashi Natsume has a peculiar and terrifying secret involving youkai: for as long as he can remember, he has been constantly chased by these spirits. Natsume soon discovers that his deceased grandmother Reiko had passed on to him the Yuujinchou, or \"Book of Friends,\" which contains the names of the spirits whom she brought under her control. Now in Natsume's possession, the book gives Reiko's grandson this power as well, which is why these enraged beings now haunt him in hopes of somehow attaining their freedom.",
            "Gabi Braun and Falco Grice have been training their entire lives to inherit one of the seven titans under Marley's control and aid their nation in eradicating the Eldians on Paradis. However, just as all seems well for the two cadets, their peace is suddenly shaken by the arrival of Eren Yeager and the remaining members of the Survey Corps."
    };

    public static ArrayList<MainModel> getListData(){
        MainModel mainModel = null;
        ArrayList<MainModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            mainModel = new MainModel();
            mainModel.setNamaAnime(title[i]);
            mainModel.setGambarAnime(thumbnail[i]);
            mainModel.setGenreAnime(genre[i]);
            mainModel.setDetailAnime(keterangan[i]);
            list.add(mainModel);
        }
        return list;
    }
}

