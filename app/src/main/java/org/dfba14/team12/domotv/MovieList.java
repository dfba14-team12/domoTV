package org.dfba14.team12.domotv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {

    public static List<Movie> list;

    public static List<Movie> setupMovies() {
        list = new ArrayList<Movie>();
        String title[] = {
                "WebCam",
                "A Celestial Witch’s Broom? (FullHD)",
                "Setting the Dark on Fire (FullHD)",
                "Philae Comet Landing (4k)",
                "Evaporating Peaks: Pillars in the Monkey Head Nebula"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. "
                + "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est "
                + "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit "
                + "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit "
                + "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id "
                + "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat.";

        String videoUrl[] = {
                "http://10.29.135.221:8080/video",
                "http://10.29.135.206/video/eso1236b.m4v",
                "http://10.29.135.206/video/eso1304b.m4v",
                "http://10.29.135.206/video/comet_360p.mp4",
                "http://10.29.135.206/video/hubble-carina.webm"
        };
        String bgImageUrl[] = {
                "http://10.29.135.221:8080/video/shot.jpg",
                "http://10.29.135.206/image/eso1236a.jpg",
                "http://10.29.135.206/image/eso1304a.jpg",
                "http://10.29.135.206/image/comet-360p_card.jpg",
                "http://10.29.135.206/image/hubble-carina.jpg"
        };
        String cardImageUrl[] = {
                "http://10.29.135.206/image/movie.png",
                "http://10.29.135.206/image/eso1236a_card.jpg",
                "http://10.29.135.206/image/eso1304a_card.jpg",
                "http://10.29.135.206/image/comet-360p_card.jpg",
                "http://10.29.135.206/image/hubble-carina_card.jpg"
        };

        list.add(buildMovieInfo("category", title[0],
                description, "Cell", videoUrl[0], cardImageUrl[0], bgImageUrl[0]));
        list.add(buildMovieInfo("category", title[1],
                description, "ESO", videoUrl[1], cardImageUrl[1], bgImageUrl[1]));
        list.add(buildMovieInfo("category", title[2],
                description, "ESO", videoUrl[2], cardImageUrl[2], bgImageUrl[2]));
        list.add(buildMovieInfo("category", title[3],
                description, "ESO", videoUrl[3], cardImageUrl[3], bgImageUrl[3]));
        list.add(buildMovieInfo("category", title[4],
                description, "NASA Hubble", videoUrl[4], cardImageUrl[4], bgImageUrl[4]));

        return list;
    }

    private static Movie buildMovieInfo(String category, String title,
                                        String description, String studio, String videoUrl, String cardImageUrl,
                                        String bgImageUrl) {
        Movie movie = new Movie();
        movie.setId(Movie.getCount());
        Movie.incCount();
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCategory(category);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(bgImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}
