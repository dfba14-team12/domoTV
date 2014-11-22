package org.dfba14.team12.domotv;

import java.util.ArrayList;
import java.util.List;

public final class LightList {

    public static List<Light> list;

    public static List<Light> setupLights() {
        list = new ArrayList<Light>();
        String title[] = {
                "Matrimoniale",
                "Singola",
                "Bagno",
                "Bagno",
                "Suite",
                "Ingresso",
                "Suite",
                "Soggiorno"
        };

        String description = "Descrizione";

        String bgImageUrl[] = {
                "http://10.29.135.206/image/casa1.png",
                "http://10.29.135.206/image/casa2.png",
                "http://10.29.135.206/image/casa3.png",
                "http://10.29.135.206/image/casa4.png",
                "http://10.29.135.206/image/casa5.png",
                "http://10.29.135.206/image/casa6.png",
                "http://10.29.135.206/image/casa7.png",
                "http://10.29.135.206/image/casa1.png"

        };
        String cardImageUrl[] = {
                "http://10.29.135.206/image/casa1.png",
                "http://10.29.135.206/image/casa2.png",
                "http://10.29.135.206/image/casa3.png",
                "http://10.29.135.206/image/casa4.png",
                "http://10.29.135.206/image/casa5.png",
                "http://10.29.135.206/image/casa6.png",
                "http://10.29.135.206/image/casa7.png",
                "http://10.29.135.206/image/casa1.png"

        };
/*        list.add(buildMovieInfo("category", title[0],
                description, "Cell", videoUrl[0], cardImageUrl[0], bgImageUrl[0]));
        list.add(buildMovieInfo("category", title[1],
                description, "ESO", videoUrl[1], cardImageUrl[1], bgImageUrl[1]));
        list.add(buildMovieInfo("category", title[2],
                description, "ESO", videoUrl[2], cardImageUrl[2], bgImageUrl[2]));
        list.add(buildMovieInfo("category", title[3],
                description, "ESO", videoUrl[3], cardImageUrl[3], bgImageUrl[3]));
        list.add(buildMovieInfo("category", title[4],
                description, "NASA Hubble", videoUrl[4], cardImageUrl[4], bgImageUrl[4]));
*/        return list;
    }

    private static Light buildLightInfo(String status, String name,
                                        String position, String cardImageUrl,
                                        String bgImageUrl) {

        Light light = new Light();
        light.setName(name);
        light.setPosition(position);
        light.setStatus(status);
        light.setCardImageUrl(cardImageUrl);
        light.setBackgroundImageUrl(bgImageUrl);
        return light;
    }

}
