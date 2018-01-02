package cc.ccoder.test;

import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * @author : ChenCong
 * @date : Created in 17:40 2018/1/2
 */
public class GetMusicID {

    public static void main(String[] args) throws IOException {
        Jsoup.connect("http://music.163.com/playlist?id=317113395")
                .header("Referer", "http://music.163.com/")
                .header("Host", "music.163.com").get().select("ul[class=f-hide] a")
                .stream().map(w-> w.text() + "-->" + w.attr("href"))
                .forEach(System.out::println);

    }
}
