package data;

/**
 * Created by darin on 17-2-14.
 */
public class Constant {
    private static String urlOfYouDao = "http://fanyi.youdao.com/translate?smartresult=dict&smartresult=rule&smartresult=ugc&type=AUTO&i=";
    private static String firstKeyWordOfYouDao = "global.translatedJson = ";
    private static String secondKeyWordOfYouDao = "};";

    public enum DictApi {
        YOUDAO(urlOfYouDao, firstKeyWordOfYouDao, secondKeyWordOfYouDao);


        DictApi(String api, String firstKeyWord, String secondkeyWord) {
            this.api = api;
            this.firstKeyWord = firstKeyWord;
            this.secondKeyWord = secondkeyWord;
        }

        public String api;
        public String firstKeyWord;
        public String secondKeyWord;

    }

}
